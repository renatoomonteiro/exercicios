package oo.heranca;

public class Monstro extends Jogador{// Classe Monstro que herda as características da classe Jogador
	// Através da palavra reservada "extends".

		//Criação do construtor padrão
	
	Monstro(){
		super(0, 0);
	}	
	
	Monstro(int x, int y){
		super(x, y);
		
	}
}
