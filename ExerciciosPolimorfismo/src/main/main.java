package main;

import model.*;

public class main {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Rex");
		cachorro.setIdade(10);
		cachorro.emitirSom();
		cachorro.acao();
		System.out.println();
		
		cavalo.setNome("Relanpago");
		cavalo.setIdade(6);
		cavalo.emitirSom();
		cavalo.acao();
		System.out.println();
		
		preguica.setNome("Preguicinha");
		preguica.setIdade(4);
		preguica.emitirSom();
		preguica.acao();
		
		System.out.println();
		
		Veterinario vet = new Veterinario();
		
		vet.examinar(cachorro.getNome(), cavalo.getNome(), preguica.getNome());
		
	}

}
