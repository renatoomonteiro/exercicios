package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // Queue é fila, em inglês
		
		//Offer e Add: Adicionam elementos na fila
		//A diferença é comportamento quando a fila está cheia!
		fila.add("Ana");
		fila.offer("Bia"); // offer limita o tamanho da fila
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Métodos de exibição de elementos da fila: peek e element
		// Ambos não os removem da fila 
		
		// Peek e element-> obtém o próximo elemento da fila (sem mover)
		//A direfença é quando a fila está vazia
		System.out.println(fila.peek()); // Exibindo o elemento da fila, nesse caso, o primeiro; Ana
		System.out.println(fila.peek()); // Continua exibindo o primeiro, pois não foi excluído
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		//fila.size(); //Tamanho da fila
		//fila.clear(); //Limpará a fila
		//fila.isEmpty(); //Para saber se a fila está ou não vazia
		//fila.poll();// Retornará o primeiro elemento da fila já o removendo;
		
//		Poll e remove -> obtém o próximo elemento da fila  e remove
		
		
		System.out.println(fila.poll()); // Retornará vazio quando remover o último elemento
		System.out.println(fila.remove()); // Remove da lista desde que esta não esteja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());

		
		
		

	}

}
