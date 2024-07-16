package io.github.marcossantos.msavaliadorcredito.domain.model;

import java.util.Objects;

public class DadosCliente {

	private Long id;
	private String nome;
	private Integer idade;

	public DadosCliente(Long id, String nome, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosCliente other = (DadosCliente) obj;
		return Objects.equals(id, other.id) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "DadosCliente [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
	}

}
