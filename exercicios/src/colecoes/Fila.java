package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // Queue � fila, em ingl�s
		
		//Offer e Add: Adicionam elementos na fila
		//A diferen�a � comportamento quando a fila est� cheia!
		fila.add("Ana");
		fila.offer("Bia"); // offer limita o tamanho da fila
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// M�todos de exibi��o de elementos da fila: peek e element
		// Ambos n�o os removem da fila 
		
		// Peek e element-> obt�m o pr�ximo elemento da fila (sem mover)
		//A direfen�a � quando a fila est� vazia
		System.out.println(fila.peek()); // Exibindo o elemento da fila, nesse caso, o primeiro; Ana
		System.out.println(fila.peek()); // Continua exibindo o primeiro, pois n�o foi exclu�do
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size(); //Tamanho da fila
		//fila.clear(); //Limpar� a fila
		//fila.isEmpty(); //Para saber se a fila est� ou n�o vazia
		//fila.poll();// Retornar� o primeiro elemento da fila j� o removendo;
		
//		Poll e remove -> obt�m o pr�ximo elemento da fila  e remove
		
		
		System.out.println(fila.poll()); // Retornar� vazio quando remover o �ltimo elemento
		System.out.println(fila.remove()); // Remove da lista desde que esta n�o esteja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		
		
		

	}

}
