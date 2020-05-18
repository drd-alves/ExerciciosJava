package Exercicio2;

import java.util.Scanner;

public class InstanciandoPessoa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String nome = "";
		Double nascimento = null;
		
		Pessoa calcIdade = new Pessoa(nome, nascimento);
		
		System.out.println("Digite seu nome: ");
		nome = in.next();
		calcIdade.setNome(nome);
		
		System.out.println("Digite seu ano de nascimento: ");
		nascimento = in.nextDouble();
		calcIdade.setNascimento(nascimento);
		
		calcIdade.mostrarNomeIdade();
	}

}
