package model;

public class Cachorro extends Animal{
	
	public void emitirSom() {
		System.out.println(getNome() + " est� latindo!");
	}
	
	public void acao() {
		System.out.println(getNome() + " est� correndo");
	}
	
}
