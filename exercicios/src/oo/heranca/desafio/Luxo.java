package oo.heranca.desafio;

public interface Luxo {
	public void ligarAr(); // Método com nível de visibilidade pública
	abstract void desligarAr(); // Método abstrato, ou seja, não possui corpo
	default int velocidadeDoAr() { //Método padrão de retorno simples
		return 1;
	}
}
