package JavaExercicios;

public class exercicio2 {
	public static void main(String args[]) {
		
		/* 2- Escreva um sistema estruturado que gere os números de 1000 a
		1999 e escreva
		somente os números que são divisíveis por 11 ou cujo resto é 5. */
		
		int i = 1000;
		
		while(i<1999) {
			i = i+11;
			System.out.println(i-11);
		}
	}
}
