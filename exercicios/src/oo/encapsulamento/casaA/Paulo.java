package oo.encapsulamento.casaA;

public class Paulo {
	
	Ana esposa = new Ana();  //Vari�vel esposa aponta para a classe Ana, que criar� um m�todo construtor do tipo classe Ana()
	// para acessar seus atributos, vari�veis e m�todos.
	
	
	void testeAcessos(){// M�todo que ir� testar os acessos das classes

		
		// Vari�vel inacess�vel, pois � do tipo de visibilidade privada, vis�vel apenas para a classe Ana
        // System.out.println(esposa.segredo); 
		
		//Vari�veis de Ana acess�vels devido o n�vel de visibilidade
		System.out.println(esposa.facoDentroDeCasa); 
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
		
	}
}
