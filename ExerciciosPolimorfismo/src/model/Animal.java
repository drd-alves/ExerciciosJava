package model;

public abstract class Animal {

	protected String nome;
	private int idade;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public abstract void emitirSom();
	
	public abstract void acao();
	
}
