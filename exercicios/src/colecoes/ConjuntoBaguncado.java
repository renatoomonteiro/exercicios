package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Convers�o autom�tica de uma vari�vel double para uma classe do tipo Double
		conjunto.add(true); // Convers�o autom�tica de uma vari�vel do tipo boolean para uma classe do tipo Boolean
		conjunto.add("Teste"); // A convers�o de string n�o precisa pois j� � um objeto 
		conjunto.add(1); // Convers�o autom�tica de uma vari�vel int para uma classe do tipo Integer
		conjunto.add('x'); // Convers�o de uma vari�vel do tipo char para Caractere
	}

}
