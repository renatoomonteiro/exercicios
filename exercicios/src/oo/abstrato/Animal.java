package oo.abstrato;

public abstract class Animal {
	
	public String respirar() { // M�todo padr�o que servir� para exibir
		return "Usando Oxig�nio!"; // o CO2 emitido ao respirar.
	}
// Cria��o de m�todo n�o abstrato
//	public double mover() {
//		return 0; // M�todo padr�o respons�vel por exibir a movimenta��o em 
//	} // mil�metros
	
	// Cria��o de m�todo abstrato
	public abstract String mover(); // Classe abstrata n�o possui corpo, ou seja, abre e 
	//fecha chaves {}.
 
}
