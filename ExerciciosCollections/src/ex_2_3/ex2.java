package ex_2_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ex2 {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>(); //Criando um Arraylist
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(2); //populando o array
		
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		} //imprimindo o array com forEach
		
		Set<Integer> meuSet = new HashSet<Integer>(); // populando um novo arrayList
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1);
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		while(iMeuSet.hasNext()){
			System.out.println(iMeuSet.next());
		} // imprimindo o novo array com o Interator, deixando-o em ordem e sem duplicar
	}
}
