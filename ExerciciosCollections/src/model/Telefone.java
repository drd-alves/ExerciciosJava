package model;

public class Telefone {
	
	private String nrTelefone;
	private String tipoTelefone;
	
	public Telefone(String nrTelefone, String tipoTelefone) {
		this.nrTelefone = nrTelefone;
		this.tipoTelefone = tipoTelefone;
	}
	
// 	public String toString() {
// 		switch(digitando) {
// 		case 1:
// 			
// 		}
// 	}
	
	
	public String getNrTelefone() {
		return nrTelefone;
	}
	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
}
