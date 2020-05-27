package model;

public class Veiculos {
	
	private String marca;
	private String motor;
	private int velocidadeMax;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	public void acelerar() {
		int velAtual = 0;
		while(velAtual <= this.velocidadeMax) {
			velAtual++;
			System.out.println(velAtual);
		}
	}
		
		public void freiar() {
			int velAtual = getVelocidadeMax();
			while(velAtual > 0) {
				velAtual--;
				System.out.println(velAtual);
			}
	}
	
	
}
