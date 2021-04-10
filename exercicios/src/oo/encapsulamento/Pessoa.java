package oo.encapsulamento;

public class Pessoa {
	private int idade; // Só que pode ler e editar essa variável será a classe Pessoa
	
	// Métodos Getters Setter
	
	public Pessoa(int idade) {
		this.idade = idade;
	}
	
	public int lerIdade() {
		return idade;
	}
}
