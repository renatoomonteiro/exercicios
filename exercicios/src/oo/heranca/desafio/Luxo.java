package oo.heranca.desafio;

public interface Luxo {
	public void ligarAr(); // M�todo com n�vel de visibilidade p�blica
	abstract void desligarAr(); // M�todo abstrato, ou seja, n�o possui corpo
	default int velocidadeDoAr() { //M�todo padr�o de retorno simples
		return 1;
	}
}
