package model;

public class Cavalo extends Animal{
	
	public void emitirSom() {
		System.out.println(getNome() + " est� relinchando!");
	}
	
	public void acao() {
		System.out.println(getNome() + " est� correndo");
	}
}
