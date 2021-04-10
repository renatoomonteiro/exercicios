package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana; // Importação do pacote onde está a classe Ana, para que os atributos
// estejam disponíveis para a classe Ana

public class Pedro extends Ana{ // A classe Pedro herdará atributos e comportamentos da classe Ana, devido
	// a palavra reservada extends.
	
	void testeAcessos() { // Método que irá testar os acessos das classes
	
		//Ana mae = new Ana(); // variável mae apontará para a classe Ana.
		
		// Variável invisível para outras classes, pois é exclusiva da classe Ana
        //System.out.println(segredo); // Variável inacessível por herança, pois é exclusiva da classe Ana

        // Esta variável é visível apenas para as classes do mesmo pacote
        //System.out.println(facoDentroDeCasa); //Acesível para Pedro apenas se estivesse no mesmo pacote de Ana
        
		//Variáveis acessíveis via herança, não acessível via instância
		System.out.println(formaDeFalar); // Acesso direto, pois Pedro herdará de Ana
		//System.out.println(todosSabem); // Acesso direto, pois Pedro herdará de Ana
		
		//Outro método de acessar é criando uma nova Ana
		System.out.println(new Ana().todosSabem); // acessando como atributo de ana
		
		
		
	}
	
	
	
	

}
