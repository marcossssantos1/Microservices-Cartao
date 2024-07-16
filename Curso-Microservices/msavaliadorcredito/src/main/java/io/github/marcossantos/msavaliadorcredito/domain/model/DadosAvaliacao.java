package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.util.Objects;

public class DadosAvaliacao {

	private String cpf;
	private Long renda;

	public DadosAvaliacao(String cpf, Long renda) {
		super();
		this.cpf = cpf;
		this.renda = renda;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Long getRenda() {
		return renda;
	}

	public void setRenda(Long renda) {
		this.renda = renda;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, renda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosAvaliacao other = (DadosAvaliacao) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(renda, other.renda);
	}

	@Override
	public String toString() {
		return "DadosAvaliacao [cpf=" + cpf + ", renda=" + renda + "]";
	}

}
