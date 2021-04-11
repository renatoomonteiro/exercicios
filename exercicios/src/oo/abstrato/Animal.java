package oo.abstrato;

public abstract class Animal {
	
	public String respirar() { // Método padrão que servirá para exibir
		return "Usando Oxigênio!"; // o CO2 emitido ao respirar.
	}
// Criação de método não abstrato
//	public double mover() {
//		return 0; // Método padrão responsável por exibir a movimentação em 
//	} // milímetros
	
	// Criação de método abstrato
	public abstract String mover(); // Classe abstrata não possui corpo, ou seja, abre e 
	//fecha chaves {}.
 
}
