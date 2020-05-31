package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.*;

public class main {

	public static void main(String[] args) {
		
		List<Telefone> lista = new ArrayList<Telefone>();
		
		Telefone celular = new Telefone("995648-5469", "celular");
		Telefone comercial = new Telefone("995648-4874", "Comercial");
		Telefone fixo = new Telefone("4647-5652", "Fixo");
		lista.add(celular);
		lista.add(comercial);
		lista.add(fixo);
		
		Telefone telefone ;
		Iterator<Telefone> itr = lista.iterator();		
		
		while(itr.hasNext()) {
			telefone = itr.next();
			System.out.println(telefone.getNrTelefone() + " " + telefone.getTipoTelefone());
		}
	}
}

