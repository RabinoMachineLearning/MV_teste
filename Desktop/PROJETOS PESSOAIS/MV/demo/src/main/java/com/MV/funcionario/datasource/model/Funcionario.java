package com.MV.funcionario.datasource.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity 
@Table

(name="funcionario")
public class Funcionario implements Serializable{

		private static final long serialVersionUID = -9036133340778188525L;
	
		
		
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private String id;	
	private String cpf;
	
	@Column (name= "idComida")
	private String comida;
	private String nome;

	
	
	

	
	public Funcionario() {
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	


	
	
	
	
	
	
	
	
	
	
	
}
