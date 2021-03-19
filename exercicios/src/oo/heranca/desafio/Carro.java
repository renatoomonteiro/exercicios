package oo.heranca.desafio;

public class Carro {
	/*
	 * Desafio da aula 152
	 * A classe pai já não possui mais o construtor padrão, será necessário dar manutenção nas classes filhas:
	 * Ferrari e Fusca
	 * */
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual, delta=5;
	
	Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar()  {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual +=delta;
		}
	}
	
	
	void frear() {
		if (velocidadeAtual >= 5) {
		velocidadeAtual -= 5;
		}else {
			velocidadeAtual=0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}
}
