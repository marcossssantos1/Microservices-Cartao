package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

public class DadosSolicitacaoEmissaoCartao {

	private Long idCartao;
	private String cpf;
	private String endereco;
	private BigDecimal limiteLiberado;

	public DadosSolicitacaoEmissaoCartao(Long idCartao, String cpf, String endereco, BigDecimal limiteLiberado) {
		super();
		this.idCartao = idCartao;
		this.cpf = cpf;
		this.endereco = endereco;
		this.limiteLiberado = limiteLiberado;
	}

	public Long getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(Long idCartao) {
		this.idCartao = idCartao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getLimiteLiberado() {
		return limiteLiberado;
	}

	public void setLimiteLiberado(BigDecimal limiteLiberado) {
		this.limiteLiberado = limiteLiberado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, endereco, idCartao, limiteLiberado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosSolicitacaoEmissaoCartao other = (DadosSolicitacaoEmissaoCartao) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(idCartao, other.idCartao) && Objects.equals(limiteLiberado, other.limiteLiberado);
	}

	@Override
	public String toString() {
		return "DadosSolicitacaoEmissaoCartao [idCartao=" + idCartao + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", limiteLiberado=" + limiteLiberado + "]";
	}

}
