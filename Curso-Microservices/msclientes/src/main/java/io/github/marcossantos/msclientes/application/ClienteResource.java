package io.github.marcossantos.msclientes.application;


import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.google.common.base.Optional;

import io.github.marcossantos.msclientes.application.representation.ClienteSaveRequest;
import io.github.marcossantos.msclientes.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
@Slf4j
public class ClienteResource {
	
	private static Logger logger = LoggerFactory.getLogger(ClienteResource.class);

	@Autowired
	private ClienteService service;

	@GetMapping
	public String status() {
		logger.info("Obtendo o status do microservice de clientes");
		return "ok";
	}

	@PostMapping
	public ResponseEntity save(@RequestBody ClienteSaveRequest request) {
		var cliente = request.toModel();
		service.save(cliente);
		URI headerLocation = ServletUriComponentsBuilder.fromCurrentRequest().query("cpf={cpf}")
				.buildAndExpand(cliente.getCpf()).toUri();
		return ResponseEntity.created(headerLocation).build();
	}

	@GetMapping(params = "cpf")
	public ResponseEntity dadosCliente(@RequestParam("cpf") String cpf) {
		Optional<Cliente> cliente = service.getByCPF(cpf);
		if (cliente == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(cliente);
	}

}
