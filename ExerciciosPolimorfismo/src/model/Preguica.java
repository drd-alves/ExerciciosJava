package model;

public class Preguica extends Animal{
	
	public void emitirSom() {
		System.out.println(getNome() + " est� emitindo som");
	}
	
	public void acao() {
		System.out.println(getNome() + " est� subindo na arvore");
	}
}
