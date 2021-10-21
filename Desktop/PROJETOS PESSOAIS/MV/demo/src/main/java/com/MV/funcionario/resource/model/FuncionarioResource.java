package com.MV.funcionario.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FuncionarioResource {

	
	
	@JsonProperty("nome_funcionario")
	
	private String nome;
	private String cpf;
	
	@JsonProperty ("id_Comida")
	private String comida;
	
	
	
	public FuncionarioResource(String nome, String cpf, String comida) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.comida = comida;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getComida() {
		return comida;
	}



	public void setComida(String comida) {
		this.comida = comida;
	}
	
	
	
	
	
}
