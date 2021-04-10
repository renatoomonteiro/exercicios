package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//Mapa: Estrutura no modelo "chave":"valor"

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		//		Para adicionar utiliza-se o método put, ao invés de add.

		usuarios.put(1,"Roberto"); // O ID 1, receberá o valor "Roberto".
		usuarios.put(20,"Ricardo"); // O método put serve para adicionar e alterar, caso seja passado
		// o mesmo ID.
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");

		System.out.println(usuarios.size()); // Exibe o tamanho
		System.out.println(usuarios.isEmpty()); // Está vazio? False

		System.out.println(usuarios.keySet()); // Exibe o conjunto das chaves em um array, mas de forma desordenada.
		System.out.println(usuarios.values()); // Exibe os valores das chaves.
		System.out.println(usuarios.entrySet()); // Exibição de chave e valor
		System.out.println(usuarios.containsKey(20)); // Contém essa chave? Resultado booleano
		System.out.println(usuarios.containsValue("Rebeca")); // Contém essa chave? Resultado booleano
		
		System.out.println(usuarios.get(20)); // Exibirá o elemento cujo o ID é 20 
		System.out.println(usuarios.remove(1)); // Removerá o valor Roberto através da chave
		System.out.println(usuarios.remove(4,"Gui")); // Não removerá o valor Gui, pois não há
													  // O valor associado à chave 4 é Rebeca	
		 

		//For para exibir todas as chaves do objeto de forma não sequencial
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}

		//For para exibir o valor de todas as chaves do objeto de forma não sequencial
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
			
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print("Chave: " +registro.getKey()+","); // Exibição da chave
			System.out.println(" Valor: " +registro.getValue()); // Exibição do valor
			
		}





	}

}
