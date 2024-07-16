package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import lombok.Data;

@Data
public class Cartao {
	private Long id;
	private String nome;
	private String bandeira;
	private BigDecimal limiteBasico;

	public Cartao(Long id, String nome, String bandeira, BigDecimal limiteBasico) {
		super();
		this.id = id;
		this.nome = nome;
		this.bandeira = bandeira;
		this.limiteBasico = limiteBasico;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public BigDecimal getLimiteBasico() {
		return limiteBasico;
	}

	public void setLimiteBasico(BigDecimal limiteBasico) {
		this.limiteBasico = limiteBasico;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cartao other = (Cartao) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Cartao [id=" + id + ", nome=" + nome + ", bandeira=" + bandeira + ", limiteBasico=" + limiteBasico
				+ "]";
	}

}