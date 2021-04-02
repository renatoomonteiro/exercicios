package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();  //Variável esposa aponta para a classe Ana, que criará um método construtor do tipo classe Ana()
	// para acessar seus atributos, variáveis e métodos.
	
	
	void testeAcessos(){// Método que irá testar os acessos das classes

		
		// Variável inacessível, pois é do tipo de visibilidade privada, visível apenas para a classe Ana
        // System.out.println(esposa.segredo); 
		
		//Variáveis de Ana acessívels devido o nível de visibilidade
		System.out.println(esposa.facoDentroDeCasa); 
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
		
	}
}
