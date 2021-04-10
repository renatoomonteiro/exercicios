package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {


		Deque<String> livros = new ArrayDeque<String>();

		
		// Adicionando bojetos na pilha, nesse caso, livros.
		livros.add("O pequeno príncipe"); // Insere elemento com retorno booleano
		livros.push("Don Quixote"); //Insere elemento desde que haja espaço
		livros.push("O Hobbit");


		// Durante a exibição, será mostrado o último elemento
		//tendo em vista o sistema LIFO
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//Foreach para varrer a pilha
		for(String livro: livros) { 
			System.out.println(livro);
		}
		
		System.out.println(livros.pop()); // pop também remove, porém, retornará uma excessão 
//		caso não haja elementos na pilha
		System.out.println(livros.poll()); //Removerá o 1°
		System.out.println(livros.poll()); //Removerá o 2°
		System.out.println(livros.poll()); //Removerá o 3°
		System.out.println(livros.poll()); //Retornará nulo
		
//		livros.size(); // Tamanho
//		livros.clear(); // Limpar 
//		livros.contains(); // Contém?
//		livros.isEmpty(); // Está vazia, resultado booleano
		
	}

}
