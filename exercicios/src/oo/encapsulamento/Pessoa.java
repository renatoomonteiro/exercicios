package oo.encapsulamento;

public class Pessoa {
	private int idade; // S� que pode ler e editar essa vari�vel ser� a classe Pessoa
	
	// M�todos Getters Setter
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public int lerIdade() {
		return idade;
	}
}
