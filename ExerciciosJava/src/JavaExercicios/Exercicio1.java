  
package JavaExercicios;

public class Exercicio1 {
	public static void main(String args[]) {
		
		/*1- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
		que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
		at� 500.*/
		
		int i,somaMultiplos = 0;	
		
		for(i=0; i<10; i++) {
			if(i%3 == 0) {
				if(i%2 != 0) {
					somaMultiplos = somaMultiplos + i;	
				}	
			}
		}
		System.out.println(somaMultiplos);
	}
}