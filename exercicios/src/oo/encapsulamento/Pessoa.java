package oo.encapsulamento;

public class Pessoa {
	
	private String nome, sobrenome;
	private int idade; // Só quem pode ler e editar essa variável será a classe Pessoa
	
	// Métodos Getters Setter
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);		
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto(){
		return getNome() + " " + getSobrenome();
				
	}
	//Famoso método Getter 
	//antigo método lerIdade
	public int getIdade() {
		return idade;
	}
	
	//Famoso método Setter (altera)
	//Antigo método alterarIdade
	public void setIdade(int novaIdade) { 
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >=0 && novaIdade <=120) {
			this.idade = novaIdade;	
		}
	}
	
	//Sobrescrita do método toString
	@Override
	public String toString() {
		return "Olá! Eu sou o " + getNome()
		+ " e tenho " + getIdade() + " anos."; 
		
	}
}
