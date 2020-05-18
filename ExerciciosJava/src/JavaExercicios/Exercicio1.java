  
package JavaExercicios;

public class Exercicio1 {
	public static void main(String args[]) {
		
		/*1- Desenvolver um sistema que efetue a soma de todos os números ímpares
		que são múltiplos de três e que se encontram no conjunto dos números de 1
		até 500.*/
		
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