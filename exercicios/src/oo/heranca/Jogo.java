package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		
		//Monstro e Heroi são classes que herdam características da classe Jogador
		//Classe pai -> Jogador
		//Classes filhas -> Monstro e Herói
		
		Monstro j1 = new Monstro(); // Instanciando um novo Jogador
		j1.x = 10; // O jogador 1 andou 10 posições na variável x
		j1.y = 10; // O jogador 1 andou 20 posições na variável y
		
		
		// Utilizando a classe Heroi, que herda as características da classe Jogador.
		Heroi j2 = new Heroi(); // Instanciando um novo Jogador
		j2.x = 10; // O jogador 1 andou 10 posições na variável x
		j2.y = 11; // O jogador 1 andou 20 posições na variável y
		
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
		
		System.out.println(j1.vida); // Exibição de quantas vezes o jogador 1 andou na coordenada y
		System.out.println(j2.vida); // Exibição de quantas vezes o jogador 1 andou na coordenada x
		
		j1.atacar(j2);// Método atacar da classe Jogador com o parâmetro j2, jogador 2.
		j2.atacar(j1);// Jogador 2 ataca o jogador 1
		
		System.out.println(j1.vida);
		System.out.println(j2.vida);
	}
}
