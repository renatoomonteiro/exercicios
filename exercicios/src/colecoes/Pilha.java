package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {


		Deque<String> livros = new ArrayDeque<String>();

		
		// Adicionando bojetos na pilha, nesse caso, livros.
		livros.add("O pequeno pr�ncipe"); // Insere elemento com retorno booleano
		livros.push("Don Quixote"); //Insere elemento desde que haja espa�o
		livros.push("O Hobbit");


		// Durante a exibi��o, ser� mostrado o �ltimo elemento
		//tendo em vista o sistema LIFO
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//Foreach para varrer a pilha
		for(String livro: livros) { 
			System.out.println(livro);
		}
		
		System.out.println(livros.pop()); // pop tamb�m remove, por�m, retornar� uma excess�o 
//		caso n�o haja elementos na pilha
		System.out.println(livros.poll()); //Remover� o 1�
		System.out.println(livros.poll()); //Remover� o 2�
		System.out.println(livros.poll()); //Remover� o 3�
		System.out.println(livros.poll()); //Retornar� nulo
		
//		livros.size(); // Tamanho
//		livros.clear(); // Limpar 
//		livros.contains(); // Cont�m?
//		livros.isEmpty(); // Est� vazia, resultado booleano
		
	}

}
