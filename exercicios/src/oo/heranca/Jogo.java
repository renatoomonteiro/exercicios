package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		// Teste de edição na classe Jogo
		
		//Monstro e Heroi são classes que herdam características da classe Jogador
		//Classe pai -> Jogador
		//Classes filhas -> Monstro e Herói
		
		Monstro monstro = new Monstro(); // Instanciando um novo Jogador
		monstro.x = 10; // O jogador 1 andou 10 posições na variável x
		monstro.y = 10; // O jogador 1 andou 20 posições na variável y
		
		Heroi heroi = new Heroi(10, 11);
		
		// Utilizando a classe Heroi, que herda as características da classe Jogador.
		//Heroi heroi = new Heroi(); // Instanciando um novo Jogador
		//heroi.x = 10; // O jogador 1 andou 10 posições na variável x
		//heroi.y = 11; // O jogador 1 andou 20 posições na variável y
		 
//		// Chamando o método passando parâmetro do tipo String
//		j1.andar("norte"); // Jogador 1 andou na direção norte uma vez
//		j1.andar("norte"); // Jogador 1 andou na direção norte uma vez
//		j1.andar("norte"); // Jogador 1 andou na direção norte uma vez
//		j1.andar("norte"); // Jogador 1 andou na direção norte uma vez
		
     	//Chamando o método passando parâmetro do tipo inteiro
//		j1.andar(1); // Jogador 1 andou na direção norte uma vez
//		j1.andar(1); // Jogador 1 andou na direção norte uma vez
//		j1.andar(1); // Jogador 1 andou na direção norte uma vez
//		j1.andar(1); // Jogador 1 andou na direção norte uma vez
		
		//Chamando o método passando o parâmetro da classe Direção
//		j1.andar(Direcao.NORTE); // Jogador 1 andou na direção norte uma vez
//		j1.andar(Direcao.LESTE); // Jogador 1 andou na direção norte uma vez
//		j1.andar(Direcao.NORTE); // Jogador 1 andou na direção norte uma vez
//		j1.andar(Direcao.LESTE); // Jogador 1 andou na direção norte uma vez
		
		System.out.println("Monstro tem => " + monstro.vida); // Exibição de quantas vezes o jogador 1 andou na coordenada y
		System.out.println("Heroi tem => " + heroi.vida); // Exibição de quantas vezes o jogador 1 andou na coordenada x
		
		monstro.atacar(heroi);// Método atacar da classe Jogador com o parâmetro j2, jogador 2.
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
