package Exercicio1;

public class InstanciandoPessoa {
	
	public static void main(String args[]) {
		
		String nome = "Maria dos Santos", email="maria@gmail.com";
		String telefone= "2255-9999";
		
		//instanciando objeto
		Pessoa pessoaMaria = new Pessoa(nome,email,telefone);
		
		pessoaMaria.setNome(nome);
		pessoaMaria.setEmail(email);
		pessoaMaria.setTelefone(telefone);
		
		//imprimindo cartão de visitas
		pessoaMaria.mostrarCartaoVisitas();
		
	}
}
