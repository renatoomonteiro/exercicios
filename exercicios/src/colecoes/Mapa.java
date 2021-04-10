package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		//Mapa: Estrutura no modelo "chave":"valor"

		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		//		Para adicionar utiliza-se o m�todo put, ao inv�s de add.

		usuarios.put(1,"Roberto"); // O ID 1, receber� o valor "Roberto".
		usuarios.put(20,"Ricardo"); // O m�todo put serve para adicionar e alterar, caso seja passado
		// o mesmo ID.
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");

		System.out.println(usuarios.size()); // Exibe o tamanho
		System.out.println(usuarios.isEmpty()); // Est� vazio? False

		System.out.println(usuarios.keySet()); // Exibe o conjunto das chaves em um array, mas de forma desordenada.
		System.out.println(usuarios.values()); // Exibe os valores das chaves.
		System.out.println(usuarios.entrySet()); // Exibi��o de chave e valor
		System.out.println(usuarios.containsKey(20)); // Cont�m essa chave? Resultado booleano
		System.out.println(usuarios.containsValue("Rebeca")); // Cont�m essa chave? Resultado booleano
		
		System.out.println(usuarios.get(20)); // Exibir� o elemento cujo o ID � 20 
		System.out.println(usuarios.remove(1)); // Remover� o valor Roberto atrav�s da chave
		System.out.println(usuarios.remove(4,"Gui")); // N�o remover� o valor Gui, pois n�o h�
													  // O valor associado � chave 4 � Rebeca	
		 

		//For para exibir todas as chaves do objeto de forma n�o sequencial
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}

		//For para exibir o valor de todas as chaves do objeto de forma n�o sequencial
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
			
		for (Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print("Chave: " +registro.getKey()+","); // Exibi��o da chave
			System.out.println(" Valor: " +registro.getValue()); // Exibi��o do valor
			
		}





	}

}
