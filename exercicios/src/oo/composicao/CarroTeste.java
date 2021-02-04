package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) { // Método principal, responsável por chamar as demais classes.


		Carro c1 = new Carro(); //Criando a variável c1, que apontará para a classe Carro sem receber parâmetros.
		System.out.println(c1.estaLigado()); // A variável c1., aponta para a classe carro, do ponto final em diante, apontará
											// para o método estaLigado

		c1.ligar(); //c1. = Classe Carro e .ligar = método ligar, da classe Carro 
		System.out.println(c1.estaLigado()); // Exibindo o status, através do método estaLigado, oriundo da classe Carro		 		

		System.out.println(c1.motor.giros()); // c1.motor, apontará para a variável motor da classe carro, que por sua vez
										      // apontará para a classe Motor, acessando o método giros, oriundo da classe motor.
		
		c1.acelerar(); // Chamando o método acelerar, responsável por multiplicar o fatorInjecao, oriundo da classe Carro
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.frear(); // Chamando o método frear, responsável por diminuir o fator injecao, oriundo da classe Carro
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		
		// Faltou Encapsulamento;
		//c1.motor.fatorInjecao=-30;

		System.out.println(c1.motor.giros()); // Exibindo os giros do motor. 
		// Relação bidirecional. motor está na classe Carro e giros está na classe motor
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		// c1. = Variável da classe CarroTeste, aponta para a classe Carro;
		// motor. = Variável oriunda da classe Carro, que por sua vez, aponta para a classe Motor;
		// carro. = Variável oriunda da classe Motor, que por sua vez, aponta para a classe Carro;
		// motor. = Variável da classe Carro, que aponta para a classe Motor;
		// carro. = Variável da classe Motor, que aponta para a classe Carro;
		// motor. = Variável da classe Carro, que aponta para a classe Motor;
		// giros() = Método giros, do tipo int, responsável por verificar o status da variável ligado, oriundo da classe Motor.
	}

}
