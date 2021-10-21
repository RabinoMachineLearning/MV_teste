package datasource.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity (nome = "funcionario")


public class Funcionario {

	
	@Id 
	private String cpf;
	
	
	private String nome;
	private String comida;
	
	@Column (cpf= "Codigo_Unico")
	
	
	
	
	
	
	
	public Funcionario(String nome, String comida, String cpf) {
	
		this.nome = nome;
		this.comida = comida;
		this.cpf = cpf;
		
	}
	

	@SuppressWarnings("unused")
	private Funcionario() {
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
