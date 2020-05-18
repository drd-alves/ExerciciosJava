package Exercicio1;

public class Pessoa {
	
	//Atributos
	private String nome,email, telefone;

	
	//metodo construtor
	public Pessoa(String nome, String email, String telefone ) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	//métodos setters e getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//outro método
	public void mostrarCartaoVisitas() {
		System.out.println(getNome() + '\n' + getEmail() + '\n' + getTelefone());
	}
	
}
