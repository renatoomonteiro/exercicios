package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) { // M�todo principal, respons�vel por chamar as demais classes.


		Carro c1 = new Carro(); //Criando a vari�vel c1, que apontar� para a classe Carro sem receber par�metros.
		System.out.println(c1.estaLigado()); // A vari�vel c1., aponta para a classe carro, do ponto final em diante, apontar�
											// para o m�todo estaLigado

		c1.ligar(); //c1. = Classe Carro e .ligar = m�todo ligar, da classe Carro 
		System.out.println(c1.estaLigado()); // Exibindo o status, atrav�s do m�todo estaLigado, oriundo da classe Carro		 		

		System.out.println(c1.motor.giros()); // c1.motor, apontar� para a vari�vel motor da classe carro, que por sua vez
										      // apontar� para a classe Motor, acessando o m�todo giros, oriundo da classe motor.
		
		c1.acelerar(); // Chamando o m�todo acelerar, respons�vel por multiplicar o fatorInjecao, oriundo da classe Carro
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.frear(); // Chamando o m�todo frear, respons�vel por diminuir o fator injecao, oriundo da classe Carro
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
		// Rela��o bidirecional. motor est� na classe Carro e giros est� na classe motor
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		// c1. = Vari�vel da classe CarroTeste, aponta para a classe Carro;
		// motor. = Vari�vel oriunda da classe Carro, que por sua vez, aponta para a classe Motor;
		// carro. = Vari�vel oriunda da classe Motor, que por sua vez, aponta para a classe Carro;
		// motor. = Vari�vel da classe Carro, que aponta para a classe Motor;
		// carro. = Vari�vel da classe Motor, que aponta para a classe Carro;
		// motor. = Vari�vel da classe Carro, que aponta para a classe Motor;
		// giros() = M�todo giros, do tipo int, respons�vel por verificar o status da vari�vel ligado, oriundo da classe Motor.
	}

}
