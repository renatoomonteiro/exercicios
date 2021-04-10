package oo.heranca;

public class Heroi extends Jogador{ // Classe Heroi que herda as caracter�sticas da classe Jogador
// Atrav�s da palavra reservada "extends".

	
	Heroi(int x, int y){
		super(x, y); // Os dois zeros s�o os par�metros inteiros que a classe receber�
}// Chamando explicitamente sempre que a classe pai n�o possuir m�todo construtor definido
	
	boolean atacar(Jogador oponente) { // M�todo atacar que ir� receber um par�metro oponente para calcular a dist�ncia entre os jogadores 
		boolean ataque1 = super.atacar(oponente); // M�todo da classe pai, sendo utilizado atrav�s da palavra super
		boolean ataque2 = super.atacar(oponente);
		boolean ataque3 = super.atacar(oponente);
		
		//Retorne o ataque 1, 2 ou 3.
		return ataque1 || ataque2 || ataque3;// Pipeline  ( || ) significa OU.
	}	
	
}
