package oo.composicao;

public class Carro {
	final Motor motor; // Variável motor irá apontar 
					   // para a classe Motor

	//Método Carro, que receberá um objeto do tipo motor, que apontará para a classe Motor.
	Carro(){ // Isso fará com que um Carro tenha um Motor
		this.motor = new Motor(this); // Instanciando um novo motor,
	}                                // através da classe Motor, 
									//na classe Carro

	void acelerar() { // Método responsável por acelerar, através da variável fatorInjecao, criada na classe Motor e inicializada com 0
		if (motor.fatorInjecao<2.6) { // Desde que não seja menor que 2.6
			motor.fatorInjecao+=0.4; // Através da incremento da injeção
		}
	}

	void frear() {// Método responsável por frear, através da variável fatorInjecao, criada na classe Motor e inicializada com 0 
		if(motor.fatorInjecao>0.5) { // Desde que não seja maior que 0.5
			motor.fatorInjecao-=0.4; //Através do decremento do fatorInjecao	
		}
	}

	void ligar() { // Método ligar, através da variável ligado, oriunda da classe Motor
		motor.ligado=true; // Caso a variável ligado, do tipo boolean receba true, significa que o carro está ligado
	}
	
	void desligar() { // Método desligar, através da variável ligado, oriunda da classe Motor
		motor.ligado=false; // Caso a variável ligado, do tipo boolean receba false, significa que o carro está desligado
	}
	
	boolean estaLigado() { //Método que verifica o status do motor, através da variável motor, oriunda da Classe Motor 
		return motor.ligado; // Através do return motor.ligado, a resposta será true ou false, dependendo de como 
	}                        // a variável ligado, da classe motor foi inicializada
	
	

}
