package oo.composicao;

public class Motor {

	//boolean ligado = false;
	
	
	Carro carro; // Variável carro recebe a referência da classe Carro
	double fatorInjecao = 1; // Variável fatorInjecao, inicializada com 1, indicará se o carro está acelerando, freando ou parado.
	public boolean ligado= false; // Variável ligado, inicializada com false, irá informar se o carro está ou não ligado
	
	

	Motor(Carro carro){	//Método construtor de Motor, que receberá um parâmetro do tipo carro, que apontará para a classe Carro 
		this.carro = carro; // Variável carro, criada na classe Motor, será igual a variável carro, que aponta para a classe Carro
	} // Isso fará com que um Motor tenha um Carro.  
	
	int giros()  {// Método giros, do tipo int, será o responsável por verificar o status da variável ligado.

		if(!ligado) { // Se não estiver ligado
			return 0; // Retornará 0.
		} else { // senão
			return (int) Math.round(fatorInjecao*3000); // Retornará um inteiro que será a multiplicação do fatorInjecao por 3000, 
		}												// Que será o RPM
	}
}
