package io.github.marcossantos.mscartoes.application;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.marcossantos.mscartoes.application.representation.CartaoSaveRequest;
import io.github.marcossantos.mscartoes.application.representation.CartoesPorClienteResponse;
import io.github.marcossantos.mscartoes.domain.Cartao;
import io.github.marcossantos.mscartoes.domain.ClienteCartao;	
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("cartoes")
public class CartoesResource {

	@Autowired
	private CartaoService cartaoService;
	@Autowired
	private ClienteCartaoService clienteCartaoService;

	@GetMapping
	public String status() {
		return "ok";
	}

	@PostMapping
	public ResponseEntity cadastra(@RequestBody CartaoSaveRequest request) {
		Cartao cartao = request.toModel();
		cartaoService.save(cartao);
		return ResponseEntity.status(org.springframework.http.HttpStatus.CREATED		).build();
	}

	@GetMapping(params = "renda")
	public ResponseEntity<List<Cartao>> getCartoesRendaAteh(@RequestParam("renda") Long renda) {
		List<Cartao> list = cartaoService.getCartoesRendaMenorIgual(renda);
		return ResponseEntity.ok(list);
	}

	@GetMapping(params = "cpf")
	public ResponseEntity<List<CartoesPorClienteResponse>> getCartoesByCliente(@RequestParam("cpf") String cpf) {
		List<ClienteCartao> lista = clienteCartaoService.listCartoesByCpf(cpf);
		List<CartoesPorClienteResponse> resultList = lista.stream().map(CartoesPorClienteResponse::fromModel)
				.collect(Collectors.toList());
		return ResponseEntity.ok(resultList);
	}

}
