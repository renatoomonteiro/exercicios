package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		
		//Monstro e Heroi s�o classes que herdam caracter�sticas da classe Jogador
		//Classe pai -> Jogador
		//Classes filhas -> Monstro e Her�i
		
		Monstro j1 = new Monstro(); // Instanciando um novo Jogador
		j1.x = 10; // O jogador 1 andou 10 posi��es na vari�vel x
		j1.y = 10; // O jogador 1 andou 20 posi��es na vari�vel y
		
		
		// Utilizando a classe Heroi, que herda as caracter�sticas da classe Jogador.
		Heroi j2 = new Heroi(); // Instanciando um novo Jogador
		j2.x = 10; // O jogador 1 andou 10 posi��es na vari�vel x
		j2.y = 11; // O jogador 1 andou 20 posi��es na vari�vel y
		
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
//		j1.andar(Direcao.NORTE); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar(Direcao.LESTE); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar(Direcao.NORTE); // Jogador 1 andou na dire��o norte uma vez
//		j1.andar(Direcao.LESTE); // Jogador 1 andou na dire��o norte uma vez
		
		System.out.println(j1.vida); // Exibi��o de quantas vezes o jogador 1 andou na coordenada y
		System.out.println(j2.vida); // Exibi��o de quantas vezes o jogador 1 andou na coordenada x
		
		j1.atacar(j2);// M�todo atacar da classe Jogador com o par�metro j2, jogador 2.
		j2.atacar(j1);// Jogador 2 ataca o jogador 1
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}
