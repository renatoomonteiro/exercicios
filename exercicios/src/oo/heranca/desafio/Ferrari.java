package oo.heranca.desafio;

public class Ferrari extends Carro{

	//@Override significa sobrescrever o método na classe pai
	void acelerar() {
		velocidadeAtual+=15;
	}
}
