package io.github.marcossantos.mscartoes.application;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.marcossantos.mscartoes.domain.Cartao;
import io.github.marcossantos.mscartoes.infra.repository.CartaoRepository;
import jakarta.transaction.Transactional;

@Service
public class CartaoService {

	@Autowired
	private CartaoRepository repository;

	@Transactional
	public Cartao save(Cartao cartao) {
		return repository.save(cartao);
	}

	public List<Cartao> getCartoesRendaMenorIgual(Long renda) {
		var rendaBigDecimal = BigDecimal.valueOf(renda);
		return repository.findByRendaLessThanEqual(rendaBigDecimal);
	}

}
