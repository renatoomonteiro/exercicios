package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({"rawtypes","unchecked"}) // Suprimir alertas do tipo 
	public static void main(String[] args) {


		HashSet conjunto = new HashSet(); // Essa estrutura n�o aceita dados repetidos.

		conjunto.add(1.2); // Convers�o autom�tica de uma vari�vel double para uma classe do tipo Double
		conjunto.add(true); // Convers�o autom�tica de uma vari�vel do tipo boolean para uma classe do tipo Boolean
		conjunto.add("Teste"); // A convers�o de string n�o precisa pois j� � um objeto 
		conjunto.add(1); // Convers�o autom�tica de uma vari�vel int para uma classe do tipo Integer
		conjunto.add('x'); // Convers�o de uma vari�vel do tipo char para Caractere

		System.out.println("Tamanho � " + conjunto.size());

		conjunto.add("teste");
		System.out.println("Tamanho � " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho � " + conjunto.size());

		System.out.println(conjunto.contains('x')); // contains=cont�m?
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet(); // Set = vari�vel que recebe um objeto. 
 
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// conjunto.addAll(nums); // Uni�o de dois conjuntos

		conjunto.retainAll(nums); // Mant�m apenas o que � comum entre os conjuntos nums e conjunto
		System.out.println(conjunto); // Exibir� o novo conte�do

		conjunto.clear(); // Limpar� todo o conte�do
		System.out.println(conjunto); // Exibir� o novo conjunto vazio

	}

}
