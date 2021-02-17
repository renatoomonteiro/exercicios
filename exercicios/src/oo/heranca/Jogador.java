package oo.heranca;

public class Jogador {
	int x, y; // Vari�veis que identificar�o a posi��o no tabuleiro

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
