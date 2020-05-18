package Exercicio3;

public class ContaCorrente {
	
	private Number numAgencia, numConta, operacao;
	private int saldoAtual, valor;
	
	public ContaCorrente(Number numAgencia, Number numConta, Number operacao, int saldoAtual, int valor) {
		
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.operacao = operacao;
		this.saldoAtual = saldoAtual;
		this.valor = saldoAtual;
	}

	public Number getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(Number numAgencia) {
		this.numAgencia = numAgencia;
	}

	public Number getNumConta() {
		return numConta;
	}

	public void setNumConta(Number numConta) {
		this.numConta = numConta;
	}

	public Number getOperacao() {
		return operacao;
	}

	public void setOperacao(Number operacao) {
		this.operacao = operacao;
	}

	public int getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(int saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	//metodos
	public void mostrar() {
		System.out.println("Saldo atual: R$" + getSaldoAtual());
	}
	
	public int depositar() {
		saldoAtual = saldoAtual + valor;
		return saldoAtual;
	}
	
	public int sacar() {
		saldoAtual = saldoAtual - valor;
		return saldoAtual;
	}

}
