package model;

public class Cavalo extends Animal{
	
	public void emitirSom() {
		System.out.println(getNome() + " está relinchando!");
	}
	
	public void acao() {
		System.out.println(getNome() + " está correndo");
	}
}
