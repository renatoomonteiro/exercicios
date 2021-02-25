package oo.heranca;

public class Heroi extends Jogador{ // Classe Heroi que herda as características da classe Jogador
// Através da palavra reservada "extends".

	boolean atacar(Jogador oponente) { // Método atacar que irá receber um parâmetro oponente para calcular a distância entre os jogadores 
		boolean ataque1 = super.atacar(oponente); // Método da classe pai, sendo utilizado através da palavra super
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		//Retorne o ataque 1, 2 ou 3.
		return ataque1 || ataque2 || ataque3;// Pipeline  ( || ) significa OU.
	}	
	
}
