package oo.heranca.desafio;

public class Ferrari extends Carro{

	Ferrari() {
		this(315);
		// TODO Auto-generated constructor stub
	}
	
	Ferrari(int velocidadeMaxima){
		super (velocidadeMaxima);
		delta =350;
	}

	//@Override significa sobrescrever o m�todo na classe pai
	void acelerar() {
//		velocidadeAtual+=15;
		super.acelerar();
	}
		//Invocar o construtor passando os par�metros de forma expl�cita
	
}