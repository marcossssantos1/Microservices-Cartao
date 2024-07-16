package io.github.marcossantos.mscartoes.application.representation;

import java.math.BigDecimal;

import io.github.marcossantos.mscartoes.domain.ClienteCartao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartoesPorClienteResponse {

	private String nome;
	private String bandeira;
	private BigDecimal limiteLiberado;

	public CartoesPorClienteResponse() {
	}

	public CartoesPorClienteResponse(String nome, String bandeira, BigDecimal limiteLiberado) {
		super();
		this.nome = nome;
		this.bandeira = bandeira;
		this.limiteLiberado = limiteLiberado;
	}

	public static CartoesPorClienteResponse fromModel(ClienteCartao model) {
		return new CartoesPorClienteResponse(model.getCartao().getNome(), model.getCartao().getBandeira().toString(),
				model.getLimite());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public BigDecimal getLimiteLiberado() {
		return limiteLiberado;
	}

	public void setLimiteLiberado(BigDecimal limiteLiberado) {
		this.limiteLiberado = limiteLiberado;
	}

}
