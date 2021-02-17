package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador j1 = new Jogador(); // Instanciando um novo Jogador
		
		j1.x = 10; // O jogador 1 andou 10 posições na variável x
		j1.y = 10; // O jogador 1 andou 20 posições na variável y
		
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
		j1.andar(Direcao.NORTE); // Jogador 1 andou na direção norte uma vez
		j1.andar(Direcao.LESTE); // Jogador 1 andou na direção norte uma vez
		j1.andar(Direcao.NORTE); // Jogador 1 andou na direção norte uma vez
		j1.andar(Direcao.LESTE); // Jogador 1 andou na direção norte uma vez
		
		System.out.println(j1.y); // Exibição de quantas vezes o jogador 1 andou na coordenada y
		System.out.println(j1.x); // Exibição de quantas vezes o jogador 1 andou na coordenada x
	}
}
