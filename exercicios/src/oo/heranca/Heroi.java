package oo.heranca;

public class Heroi extends Jogador{ // Classe Heroi que herda as características da classe Jogador
// Através da palavra reservada "extends".

	
	Heroi(int x, int y){
		super(x, y); // Os dois zeros são os parâmetros inteiros que a classe receberá
}// Chamando explicitamente sempre que a classe pai não possuir método construtor definido
	
	boolean atacar(Jogador oponente) { // Método atacar que irá receber um parâmetro oponente para calcular a distância entre os jogadores 
		boolean ataque1 = super.atacar(oponente); // Método da classe pai, sendo utilizado através da palavra super
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		//Retorne o ataque 1, 2 ou 3.
		return ataque1 || ataque2 || ataque3;// Pipeline  ( || ) significa OU.
	}	
	
}
