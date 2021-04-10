package classe.desafio;

public class PessoaResposta {
	String nome;
	double peso;

	PessoaResposta(String nome, double peso){
		this.nome=nome;
		this.peso=peso;
	}
	void comer(ComidaResposta comida) {
		if(comida!=null) {
			this.peso += comida.peso;					;
		}
	}
	
	String apresentar() {
		return "Olá! Eu sou o "+ nome + " e tenho " + peso + "Kg. ";
	}
}
