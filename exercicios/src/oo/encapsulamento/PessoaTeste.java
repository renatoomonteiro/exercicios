package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(30); //Agora o método precisará receber o parâmetro que é o valor da idade
		//Variável não foi inicializada com valores na classe PessoaTeste
		//  p1.idade=-30; //Alteramos o valor da variável da classe Pessoa
		System.out.println(p1.lerIdade()); // Exibimos o valor da variável

	}

}
