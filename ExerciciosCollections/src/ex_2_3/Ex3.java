package ex_2_3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	
	public static void main(String[] args) {
		
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets"; //valores
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3); // adicionando os valores ao Array
		
		System.out.println(aulas); //imprimindo o Array
		System.out.println(aulas.size()); //imprimindo o numero de indices do array
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		} // imprimindo separadamente os valores do Array
	}
}
