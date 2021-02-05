package oo.composicao;

public class Carro {
	final Motor motor; // Vari�vel motor ir� apontar 
					   // para a classe Motor

	//M�todo Carro, que receber� um objeto do tipo motor, que apontar� para a classe Motor.
	Carro(){ // Isso far� com que um Carro tenha um Motor
		this.motor = new Motor(this); // Instanciando um novo motor,
	}                                // atrav�s da classe Motor, 
									//na classe Carro

	void acelerar() { // M�todo respons�vel por acelerar, atrav�s da vari�vel fatorInjecao, criada na classe Motor e inicializada com 0
		if (motor.fatorInjecao<2.6) { // Desde que n�o seja menor que 2.6
			motor.fatorInjecao+=0.4; // Atrav�s da incremento da inje��o
		}
	}

	void frear() {// M�todo respons�vel por frear, atrav�s da vari�vel fatorInjecao, criada na classe Motor e inicializada com 0 
		if(motor.fatorInjecao>0.5) { // Desde que n�o seja maior que 0.5
			motor.fatorInjecao-=0.4; //Atrav�s do decremento do fatorInjecao	
		}
	}

	void ligar() { // M�todo ligar, atrav�s da vari�vel ligado, oriunda da classe Motor
		motor.ligado=true; // Caso a vari�vel ligado, do tipo boolean receba true, significa que o carro est� ligado
	}
	
	void desligar() { // M�todo desligar, atrav�s da vari�vel ligado, oriunda da classe Motor
		motor.ligado=false; // Caso a vari�vel ligado, do tipo boolean receba false, significa que o carro est� desligado
	}
	
	boolean estaLigado() { //M�todo que verifica o status do motor, atrav�s da vari�vel motor, oriunda da Classe Motor 
		return motor.ligado; // Atrav�s do return motor.ligado, a resposta ser� true ou false, dependendo de como 
	}                        // a vari�vel ligado, da classe motor foi inicializada
	
	

}
