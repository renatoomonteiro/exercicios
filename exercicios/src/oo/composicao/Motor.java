package oo.composicao;

public class Motor {

	//boolean ligado = false;
	
	
	Carro carro; // Vari�vel carro recebe a refer�ncia da classe Carro
	double fatorInjecao = 1; // Vari�vel fatorInjecao, inicializada com 1, indicar� se o carro est� acelerando, freando ou parado.
	public boolean ligado= false; // Vari�vel ligado, inicializada com false, ir� informar se o carro est� ou n�o ligado
	
	

	Motor(Carro carro){	//M�todo construtor de Motor, que receber� um par�metro do tipo carro, que apontar� para a classe Carro 
		this.carro = carro; // Vari�vel carro, criada na classe Motor, ser� igual a vari�vel carro, que aponta para a classe Carro
	} // Isso far� com que um Motor tenha um Carro.  
	
	int giros()  {// M�todo giros, do tipo int, ser� o respons�vel por verificar o status da vari�vel ligado.

		if(!ligado) { // Se n�o estiver ligado
			return 0; // Retornar� 0.
		} else { // sen�o
			return (int) Math.round(fatorInjecao*3000); // Retornar� um inteiro que ser� a multiplica��o do fatorInjecao por 3000, 
		}												// Que ser� o RPM
	}
}
