package JavaExercicios;

public class exercicio2 {
	public static void main(String args[]) {
		
		/* 2- Escreva um sistema estruturado que gere os n�meros de 1000 a
		1999 e escreva
		somente os n�meros que s�o divis�veis por 11 ou cujo resto � 5. */
		
		int i = 1000;
		
		for(i=1000;i<=1999; i++) {
			
			if(i%11==0 || i%5==5) {
			System.out.println(i);
			}
		}
	}
}