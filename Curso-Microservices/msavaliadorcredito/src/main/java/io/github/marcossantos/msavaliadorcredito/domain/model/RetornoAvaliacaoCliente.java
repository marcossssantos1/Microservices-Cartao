package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.util.List;
import java.util.Objects;

public class RetornoAvaliacaoCliente {

	private List<CartaoAprovado> cartoes;

	public RetornoAvaliacaoCliente(List<CartaoAprovado> cartoes) {
		super();
		this.cartoes = cartoes;
	}

	public List<CartaoAprovado> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<CartaoAprovado> cartoes) {
		this.cartoes = cartoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartoes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RetornoAvaliacaoCliente other = (RetornoAvaliacaoCliente) obj;
		return Objects.equals(cartoes, other.cartoes);
	}

	@Override
	public String toString() {
		return "RetornoAvaliacaoCliente [cartoes=" + cartoes + "]";
	}

}
