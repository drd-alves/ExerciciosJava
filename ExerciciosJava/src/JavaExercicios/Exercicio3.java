package JavaExercicios;

public class Exercicio3 {
	public static void main(String args[]) {
		
		/*3- Fa�a um programa que mostre uma contagem na tela de 233 a 456, s� que contando de
		3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver.*/
		
		int i = 231;
		
		while(i<456) {
			if(i<300 | i>=400) {
				i+=5;
			}
			else {
				i= i+3;
			}
			System.out.println(i);
		}
	}
}
