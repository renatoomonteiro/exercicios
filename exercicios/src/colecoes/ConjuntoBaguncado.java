package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	public static void main(String[] args) {
		
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Conversão automática de uma variável double para uma classe do tipo Double
		conjunto.add(true); // Conversão automática de uma variável do tipo boolean para uma classe do tipo Boolean
		conjunto.add("Teste"); // A conversão de string não precisa pois já é um objeto 
		conjunto.add(1); // Conversão automática de uma variável int para uma classe do tipo Integer
		conjunto.add('x'); // Conversão de uma variável do tipo char para Caractere
	}

}
