package oo.encapsulamento;

public class Pessoa {
	
	private String nome, sobrenome;
	private int idade; // S� quem pode ler e editar essa vari�vel ser� a classe Pessoa
	
	// M�todos Getters Setter
	
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
	//Famoso m�todo Getter 
	//antigo m�todo lerIdade
	public int getIdade() {
		return idade;
	}
	
	//Famoso m�todo Setter (altera)
	//Antigo m�todo alterarIdade
	public void setIdade(int novaIdade) { 
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >=0 && novaIdade <=120) {
			this.idade = novaIdade;	
		}
	}
	
	//Sobrescrita do m�todo toString
	@Override
	public String toString() {
		return "Ol�! Eu sou o " + getNome()
		+ " e tenho " + getIdade() + " anos."; 
		
	}
}
