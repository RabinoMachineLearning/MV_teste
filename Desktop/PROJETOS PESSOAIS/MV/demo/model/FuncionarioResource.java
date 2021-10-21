package resource.model;

public class FuncionarioResource {
	
	
	@JsonProperty(cpf = "id_cpf", nome = "funcionario", comida ="comida")
	
	private String nome;
	private String comida;
	private String cpf;
	
 
	
	public FuncionarioResource(String nome, String comida, String cpf) {
		super();
		this.nome = nome;
		this.comida = comida;
		this.cpf = cpf;
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
