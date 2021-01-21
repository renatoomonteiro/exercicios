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
		
		//Obter um usuario atrav�s do ID
		
		System.out.println(lista.get(1).nome); // Acessando por �ndice da lista
		
		// Removendo da lista atrav�s do �ndice:
		
		lista.remove(1);
		
		// Removendo a partir de um objeto:
		//lista.remove(new Usuario("Manu"))
		
		// Removendo o nome de uma lista atav�s do �ndice:
		System.out.println(">>>> "+lista.remove(1)); // ">>>>" Diferencia na hora da exibi��o
		
		// Removendo a partir de um objeto em uma exibi��o na tela:
		System.out.println(lista.remove(new Usuario("Manu"))); // Caso tenha removido, resultado = true, sen�o, = false
		System.out.println(lista.remove(new Usuario("Manu"))); // Caso tenha removido, resultado = true, sen�o, = false
		System.out.println(lista.remove(new Usuario("Manu"))); // Caso tenha removido, resultado = true, sen�o, = false
		
		// Verificando se cont�m o usu�rio descrito no contains
		
		System.out.println("Tem? "+lista.contains(new Usuario("Ana"))); // Resultado: True ou False
		System.out.println("Tem? "+lista.contains(u1)); // Verificando se o usu�rio est� atrav�s da 
		//refer�ncia direta da classe Lista
		
		
		for(Usuario user: lista ) {
			System.out.println(user.nome);
		}

	}

}
