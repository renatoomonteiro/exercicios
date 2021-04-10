package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		// Teste de edi��o na classe Jogo
		
		//Monstro e Heroi s�o classes que herdam caracter�sticas da classe Jogador
		//Classe pai -> Jogador
		//Classes filhas -> Monstro e Her�i
		
		Monstro monstro = new Monstro(); // Instanciando um novo Jogador
		monstro.x = 10; // O jogador 1 andou 10 posi��es na vari�vel x
		monstro.y = 10; // O jogador 1 andou 20 posi��es na vari�vel y
		
		Heroi heroi = new Heroi(10, 11);
		
		// Utilizando a classe Heroi, que herda as caracter�sticas da classe Jogador.
		//Heroi heroi = new Heroi(); // Instanciando um novo Jogador
		//heroi.x = 10; // O jogador 1 andou 10 posi��es na vari�vel x
		//heroi.y = 11; // O jogador 1 andou 20 posi��es na vari�vel y
		 
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
		
		System.out.println("Monstro tem => " + monstro.vida); // Exibi��o de quantas vezes o jogador 1 andou na coordenada y
		System.out.println("Heroi tem => " + heroi.vida); // Exibi��o de quantas vezes o jogador 1 andou na coordenada x
		
		monstro.atacar(heroi);// M�todo atacar da classe Jogador com o par�metro j2, jogador 2.
		heroi.atacar(monstro);// Jogador 2 ataca o jogador 1
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}
}
