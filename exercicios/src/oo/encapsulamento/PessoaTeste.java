package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro", "Amoedo",-45); //Agora o método precisará receber o parâmetro que é o valor da idade
		p1.setIdade(230); // Alterando a idade
		
		//Variável não foi inicializada com valores na classe PessoaTeste
		//  p1.idade=-30; //Alteramos o valor da variável da classe Pessoa
		System.out.println(p1.getIdade()); // Exibimos o valor da variável
		System.out.println(p1); //toString
		System.out.println(p1.getNomeCompleto());
	}

}
