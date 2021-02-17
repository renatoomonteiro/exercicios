package oo.heranca;

public class Jogador {
	int x, y; // Variáveis que identificarão a posição no tabuleiro

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
