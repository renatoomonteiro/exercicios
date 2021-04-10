package oo.heranca.desafio;

public class Carro {
	/*
	 * Desafio da aula 152
	 * A classe pai j� n�o possui mais o construtor padr�o, ser� necess�rio dar manuten��o nas classes filhas:
	 * Ferrari e Fusca
	 * */
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta=5;
	
	public Carro (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar()  {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual +=getDelta();
		}
	}
	
	
	public void frear() {
		if (velocidadeAtual >= 5) {
		velocidadeAtual -= 5;
		}else {
			velocidadeAtual=0;
		}
	}
	
	public String toString() {
		return "Velocidade atual � " + velocidadeAtual + "Km/h.";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
