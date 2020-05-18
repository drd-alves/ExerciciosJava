package Exercicio3;

import java.util.Scanner;

public class instanciandoContaCorrente {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		Number numAgencia=0, numConta=0, operacao=0;
		int saldoAtual=0, valor=0, x=0;
		
		
		ContaCorrente conta = new ContaCorrente(numAgencia,numConta, operacao,saldoAtual,valor);
		
		saldoAtual=conta.getSaldoAtual();
		
		System.out.println( "Bem vindxs! Para começar, informe o número da agencia: ");
		numAgencia= in.nextInt();
		
		System.out.println( "Agora o número da conta: ");
		numConta= in.nextInt();
		
		System.out.println("");
		System.out.println("Agencia: " + numAgencia +" Conta: " + numConta);
		System.out.println("");
		
		do {
			
			System.out.println( "Escolha a operação: ");
			System.out.println("" );
			System.out.println( "1) Ver saldo");
			System.out.println( "2) Depositar");
			System.out.println( "3) Sacar");
			System.out.println( "0) Finalizar");
			System.out.println("");
			x = in.nextInt();
			
			if(x==1) {
				conta.mostrar();
				System.out.println("");
			}
			else if( x == 2) {
				System.out.println("");
				System.out.println("Valor de depósito: R$");
				valor = in.nextInt();
				conta.setValor(valor);
				saldoAtual = conta.depositar();
				
			}else if(x == 3) {
				System.out.println("");
				System.out.println("Valor de saque: R$");
				valor = in.nextInt();
				conta.setValor(valor);
				conta.sacar();
			}
			
		}while(x != 0);
		
		System.out.println();
		System.out.println( "Obrigado!");
	}
}
