package model;

public class Preguica extends Animal{
	
	public void emitirSom() {
		System.out.println(getNome() + " está emitindo som");
	}
	
	public void acao() {
		System.out.println(getNome() + " está subindo na arvore");
	}
}
