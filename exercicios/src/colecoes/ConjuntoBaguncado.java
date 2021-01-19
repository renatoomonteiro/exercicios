package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({"rawtypes","unchecked"}) // Suprimir alertas do tipo 
	public static void main(String[] args) {


		HashSet conjunto = new HashSet(); // Essa estrutura não aceita dados repetidos.

		conjunto.add(1.2); // Conversão automática de uma variável double para uma classe do tipo Double
		conjunto.add(true); // Conversão automática de uma variável do tipo boolean para uma classe do tipo Boolean
		conjunto.add("Teste"); // A conversão de string não precisa pois já é um objeto 
		conjunto.add(1); // Conversão automática de uma variável int para uma classe do tipo Integer
		conjunto.add('x'); // Conversão de uma variável do tipo char para Caractere

		System.out.println("Tamanho é " + conjunto.size());

		conjunto.add("teste");
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é " + conjunto.size());

		System.out.println(conjunto.contains('x')); // contains=contém?
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		System.out.println(conjunto.contains(true));

		Set nums = new HashSet(); // Set = variável que recebe um objeto. 
 
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// conjunto.addAll(nums); // União de dois conjuntos

		conjunto.retainAll(nums); // Mantém apenas o que é comum entre os conjuntos nums e conjunto
		System.out.println(conjunto); // Exibirá o novo conteúdo

		conjunto.clear(); // Limpará todo o conteúdo
		System.out.println(conjunto); // Exibirá o novo conjunto vazio

	}

}
