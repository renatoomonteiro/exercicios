package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		 
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu"));
		
		//Obter um usuario através do ID
		
		System.out.println(lista.get(1).nome); // Acessando por índice da lista
		
		// Removendo da lista através do índice:
		
		lista.remove(1);
		
		// Removendo a partir de um objeto:
		//lista.remove(new Usuario("Manu"))
		
		// Removendo o nome de uma lista atavés do índice:
		System.out.println(">>>> "+lista.remove(1)); // ">>>>" Diferencia na hora da exibição
		
		// Removendo a partir de um objeto em uma exibição na tela:
		System.out.println(lista.remove(new Usuario("Manu"))); // Caso tenha removido, resultado = true, senão, = false
		System.out.println(lista.remove(new Usuario("Manu"))); // Caso tenha removido, resultado = true, senão, = false
		System.out.println(lista.remove(new Usuario("Manu"))); // Caso tenha removido, resultado = true, senão, = false
		
		// Verificando se contém o usuário descrito no contains
		
		System.out.println("Tem? "+lista.contains(new Usuario("Ana"))); // Resultado: True ou False
		System.out.println("Tem? "+lista.contains(u1)); // Verificando se o usuário está através da 
		//referência direta da classe Lista
		
		
		for(Usuario user: lista ) {
			System.out.println(user.nome);
		}

	}

}
