package oo.heranca;

public class Jogador {
	int x, y, vida=100; // Vari�veis que identificar�o a posi��o no tabuleiro e a vida come�ar� com 100%

	Jogador(){ // M�todo construtor da classe pai, que n�o receber� par�metro
		this(0, 0); // Zeros s�o par�metros inteiros do m�todo Jogador 
	}
	
	Jogador(int x, int y){ // M�todo construtor com dois par�metros inteiros recebendo as vari�veis x e y
		this.x = x; // A vari�vel x da classe Jogador cereber� o mesmo valor do par�metro x do m�todo Jogador
		this.y = y; // A vari�vel y da classe Jogador cereber� o mesmo valor do par�metro y do m�todo Jogador
	}
	
	//	boolean andar(String direcao) {// M�todo que identificar� se o jogador j� andou ou n�o atrav�s da vari�vel direcao
	//		if ("norte".equalsIgnoreCase(direcao)) { // Se andou para o a dire��o: norte,
	//			y++; //Incremente a vari�vel y
	//		}
	//		return true;
	//	}

	// Utilizando o mesmo m�todo acima, mas com vari�vel do tipo inteira

	//	boolean andar(int direcao) {// M�todo que identificar� se o jogador j� andou ou n�o atrav�s da vari�vel direcao
	//		if (direcao == 1) { // Se andou para o a dire��o: norte,
	//			y++; //Incremente a vari�vel y
	//		}
	//		return true;
	//	}

	boolean atacar(Jogador oponente) { // M�todo atacar que ir� receber um par�metro oponente para calcular a dist�ncia entre os jogadores 
		// O Jogador atual (this) est� atacando o oponente 		
		int deltaX = Math.abs(x-oponente.x); // M�todo absoluto, se � negativo ou positivo, n�o importa, exibir� apenas o valor
		int deltaY = Math.abs(y-oponente.y); // l�gica para calcular as coordenadas do jogador
		
		if(deltaX == 0 && deltaY == 1) { 
		//Jogadores com o mesmo X, estar�o na mesma coluna, e ao lado um do outro, na mesma linha, com o deltaY = 1	
			oponente.vida-=10;
			return true;
		}else if(deltaX == 1 && deltaY == 0){// A diferen�a do eixo x � 0 e a do y � 1
			oponente.vida-=10;
			return true;
		}else {
			return false;
		}
	}	
	// M�todo que receber� a classe de enumera��o para comparar a dire��o
	boolean andar(Direcao direcao) {// M�todo que identificar� se o jogador j� andou ou n�o atrav�s da vari�vel direcao
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}
