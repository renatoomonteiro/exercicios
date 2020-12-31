package classe;

public class Jantar {

	public static void main(String[] args) {

		//double pComida, pPessoa;
		
		Pessoa p1 = new Pessoa();
		p1.nomePessoa = "Renato";
		p1.pesoPessoa = 74.0;		
		
		System.out.println("O nome da pessoa é "+p1.nomePessoa+"\ne o peso antes de comer é "+p1.pesoPessoa+"Kg");

		Comida c1 = new Comida();
		c1.nomeComida = "Atum";
		c1.pesoComida = 0.400;
		double pdc = c1.pesoComida+p1.pesoPessoa;
		
		System.out.println("O nome da pessoa é "+p1.nomePessoa+"\ne o peso depois de comer é "+pdc+"Kg");


	}



}
