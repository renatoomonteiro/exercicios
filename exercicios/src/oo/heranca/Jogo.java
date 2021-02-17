package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador j1 = new Jogador(); // Instanciando um novo Jogador
		
		j1.x = 10; // O jogador 1 andou 10 posi��es na vari�vel x
		j1.y = 10; // O jogador 1 andou 20 posi��es na vari�vel y
		
//		// Chamando o m�todo passando par�metro do tipo String
//		j1.andar("norte"); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar("norte"); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar("norte"); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar("norte"); // Jogador 1 andou na dire��o norte uma vez
		
     	//Chamando o m�todo passando par�metro do tipo inteiro
//		j1.andar(1); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar(1); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar(1); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar(1); // Jogador 1 andou na dire��o norte uma vez
		
		//Chamando o m�todo passando o par�metro da classe Dire��o
		j1.andar(Direcao.NORTE); // Jogador 1 andou na dire��o norte uma vez
		j1.andar(Direcao.LESTE); // Jogador 1 andou na dire��o norte uma vez
		j1.andar(Direcao.NORTE); // Jogador 1 andou na dire��o norte uma vez
		j1.andar(Direcao.LESTE); // Jogador 1 andou na dire��o norte uma vez
		
		System.out.println(j1.y); // Exibi��o de quantas vezes o jogador 1 andou na coordenada y
		System.out.println(j1.x); // Exibi��o de quantas vezes o jogador 1 andou na coordenada x
	}
}
