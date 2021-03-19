package oo.heranca;

public class Jogador {
	int x, y, vida=100; // Variáveis que identificarão a posição no tabuleiro e a vida começará com 100%

	Jogador(){ // Método construtor da classe pai, que não receberá parâmetro
		this(0, 0); // Zeros são parâmetros inteiros do método Jogador 
	}
	
	Jogador(int x, int y){ // Método construtor com dois parâmetros inteiros recebendo as variáveis x e y
		this.x = x; // A variável x da classe Jogador cereberá o mesmo valor do parâmetro x do método Jogador
		this.y = y; // A variável y da classe Jogador cereberá o mesmo valor do parâmetro y do método Jogador
	}
	
	//	boolean andar(String direcao) {// Método que identificará se o jogador já andou ou não através da variável direcao
	//		if ("norte".equalsIgnoreCase(direcao)) { // Se andou para o a direção: norte,
	//			y++; //Incremente a variável y
	//		}
	//		return true;
	//	}

	// Utilizando o mesmo método acima, mas com variável do tipo inteira

	//	boolean andar(int direcao) {// Método que identificará se o jogador já andou ou não através da variável direcao
	//		if (direcao == 1) { // Se andou para o a direção: norte,
	//			y++; //Incremente a variável y
	//		}
	//		return true;
	//	}

	boolean atacar(Jogador oponente) { // Método atacar que irá receber um parâmetro oponente para calcular a distância entre os jogadores 
		// O Jogador atual (this) está atacando o oponente 		
		int deltaX = Math.abs(x-oponente.x); // Método absoluto, se é negativo ou positivo, não importa, exibirá apenas o valor
		int deltaY = Math.abs(y-oponente.y); // lógica para calcular as coordenadas do jogador
		
		if(deltaX == 0 && deltaY == 1) { 
		//Jogadores com o mesmo X, estarão na mesma coluna, e ao lado um do outro, na mesma linha, com o deltaY = 1	
			oponente.vida-=10;
			return true;
		}else if(deltaX == 1 && deltaY == 0){// A diferença do eixo x é 0 e a do y é 1
			oponente.vida-=10;
			return true;
		}else {
			return false;
		}
	}	
	// Método que receberá a classe de enumeração para comparar a direção
	boolean andar(Direcao direcao) {// Método que identificará se o jogador já andou ou não através da variável direcao
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
