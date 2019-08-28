package br.com.dental.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Cidade extends Generico{
	@NotBlank(message="Atributo obrigatório, por favor informe o nome da rua!")
	@Size(min=3, message="Tamanho inválido, por favor informe um nome de rua com mais de 2 caracteres!")
	private String nome;
	
	
	public Cidade() {
		super();
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
