package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana; // Importa��o do pacote onde est� a classe Ana, para que os atributos
// estejam dispon�veis para a classe Ana

public class Pedro extends Ana{ // A classe Pedro herdar� atributos e comportamentos da classe Ana, devido
	// a palavra reservada extends.
	
	void testeAcessos() { // M�todo que ir� testar os acessos das classes
	
		//Ana mae = new Ana(); // vari�vel mae apontar� para a classe Ana.
		
		// Vari�vel invis�vel para outras classes, pois � exclusiva da classe Ana
        //System.out.println(segredo); // Vari�vel inacess�vel por heran�a, pois � exclusiva da classe Ana

        // Esta vari�vel � vis�vel apenas para as classes do mesmo pacote
        //System.out.println(facoDentroDeCasa); //Aces�vel para Pedro apenas se estivesse no mesmo pacote de Ana
        
		//Vari�veis acess�veis via heran�a, n�o acess�vel via inst�ncia
		System.out.println(formaDeFalar); // Acesso direto, pois Pedro herdar� de Ana
		//System.out.println(todosSabem); // Acesso direto, pois Pedro herdar� de Ana
		
		//Outro m�todo de acessar � criando uma nova Ana
		System.out.println(new Ana().todosSabem); // acessando como atributo de ana
		
		
		
	}
	
	
	
	

}
