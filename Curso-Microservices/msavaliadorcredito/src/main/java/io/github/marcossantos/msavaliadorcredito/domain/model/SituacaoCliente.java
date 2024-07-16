package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.util.List;
import java.util.Objects;

import lombok.Builder;


@Builder
public class SituacaoCliente {

	private DadosCliente cliente;
    private List<CartaoCliente> cartoes;
    
    public SituacaoCliente() {		
	}

	public SituacaoCliente(DadosCliente cliente, List<CartaoCliente> cartoes) {
		super();
		this.cliente = cliente;
		this.cartoes = cartoes;
	}

	public DadosCliente getCliente() {
		return cliente;
	}

	public void setCliente(DadosCliente cliente) {
		this.cliente = cliente;
	}

	public List<CartaoCliente> getCartoes() {
		return cartoes;
	}

	public void setCartoes(List<CartaoCliente> cartoes) {
		this.cartoes = cartoes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cartoes, cliente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SituacaoCliente other = (SituacaoCliente) obj;
		return Objects.equals(cartoes, other.cartoes) && Objects.equals(cliente, other.cliente);
	}

	@Override
	public String toString() {
		return "SituacaoCliente [cliente=" + cliente + ", cartoes=" + cartoes + "]";
	}
    
    
}
