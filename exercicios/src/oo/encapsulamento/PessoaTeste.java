package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Pedro", "Amoedo",-45); //Agora o m�todo precisar� receber o par�metro que � o valor da idade
		p1.setIdade(230); // Alterando a idade
		
		//Vari�vel n�o foi inicializada com valores na classe PessoaTeste
		//  p1.idade=-30; //Alteramos o valor da vari�vel da classe Pessoa
		System.out.println(p1.getIdade()); // Exibimos o valor da vari�vel
		System.out.println(p1); //toString
		System.out.println(p1.getNomeCompleto());
	}

}
