package model;

public class Moto extends Veiculos{
	
	private boolean usoCapacete;
	private String tipo;
	
	public boolean isUsoCapacete() {
		return usoCapacete;
	}
	public void setUsoCapacete(boolean usoCapacete) {
		this.usoCapacete = usoCapacete;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
