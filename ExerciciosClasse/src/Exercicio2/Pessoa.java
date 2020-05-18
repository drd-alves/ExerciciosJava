package Exercicio2;

public class Pessoa {
	
	private String nome;
	private Double nascimento;
	
	public Pessoa(String nome, Double nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	
	//método get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Double nascimento) {
		this.nascimento = nascimento;
	}
	
	//outros
	public Double calcularIdade() {
		Double idade =  2020 - nascimento;
		return idade;
	}
	
	public Number calcularIdade50() {
		Double idade = 2070 - nascimento;
		return idade;
	}
	
	public void mostrarNomeIdade() {
		System.out.println( getNome() + " você tem " + calcularIdade() + " anos, e daqui 50 anos terá " + calcularIdade50());
	}
}
