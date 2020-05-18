package JavaExercicios;

public class exercicio2 {
	public static void main(String args[]) {
		
		/* 2- Escreva um sistema estruturado que gere os números de 1000 a
		1999 e escreva
		somente os números que são divisíveis por 11 ou cujo resto é 5. */
		
		int i = 1000;
		
		for(i=1000;i<=1999; i++) {
			
			if(i%11==0 || i%5==5) {
			System.out.println(i);
			}
		}
	}
}