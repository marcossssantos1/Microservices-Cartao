package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

public class CartaoCliente {

	private String nome;
	private String bandeira;
	private BigDecimal limiteLiberado;

	public CartaoCliente(String nome, String bandeira, BigDecimal limiteLiberado) {
		super();
		this.nome = nome;
		this.bandeira = bandeira;
		this.limiteLiberado = limiteLiberado;
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

	@Override
	public int hashCode() {
		return Objects.hash(bandeira, limiteLiberado, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartaoCliente other = (CartaoCliente) obj;
		return Objects.equals(bandeira, other.bandeira) && Objects.equals(limiteLiberado, other.limiteLiberado)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "CartaoCliente [nome=" + nome + ", bandeira=" + bandeira + ", limiteLiberado=" + limiteLiberado + "]";
	}

}
