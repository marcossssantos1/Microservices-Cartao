package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

public class CartaoAprovado {

	private String cartao;
	private String bandeira;
	private BigDecimal limiteAprovado;
	
	public CartaoAprovado() {
	}

	public CartaoAprovado(String cartao, String bandeira, BigDecimal limiteAprovado) {
		super();
		this.cartao = cartao;
		this.bandeira = bandeira;
		this.limiteAprovado = limiteAprovado;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public BigDecimal getLimiteAprovado() {
		return limiteAprovado;
	}

	public void setLimiteAprovado(BigDecimal limiteAprovado) {
		this.limiteAprovado = limiteAprovado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bandeira, cartao, limiteAprovado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartaoAprovado other = (CartaoAprovado) obj;
		return Objects.equals(bandeira, other.bandeira) && Objects.equals(cartao, other.cartao)
				&& Objects.equals(limiteAprovado, other.limiteAprovado);
	}

	@Override
	public String toString() {
		return "CartaoAprovado [cartao=" + cartao + ", bandeira=" + bandeira + ", limiteAprovado=" + limiteAprovado
				+ "]";
	}

}
