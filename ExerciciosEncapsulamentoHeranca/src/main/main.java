package main;

import model.Aeronaves;
import model.Carro;
import model.Moto;

public class main {

	public static void main(String[] args) {
		
		Aeronaves aviao = new Aeronaves();
		
		aviao.setNome("Apollo");
		aviao.setPorte("grande");
		aviao.setTipoMotor("Turbina a jato");
		aviao.setNumPassageiros(100);

		
		Carro huracan = new Carro();
		
		huracan.setMarca("Lamborghini");
		huracan.setMotor("v10");
		huracan.setVelocidadeMax(280);
		huracan.setNumPasageiros(2);
		huracan.setTamanhoPortaMalas("10L");
		huracan.setNumPortas(2);
		//huracan.acelerar();
		
		
		Moto hornet = new Moto();
		
		hornet.setMarca("Honda");
		hornet.setMotor("600cc");
		hornet.setVelocidadeMax(210);
		hornet.setTipo("Nacked");
		hornet.setUsoCapacete(true);
		hornet.freiar();
		
	}

}
