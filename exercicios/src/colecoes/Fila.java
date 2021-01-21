package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // Queue é fila, em inglês
		
		//Offer e Add: Adicionam elementos na fila
		//A diferença é quando a fila está cheia!
//		fila.add("Ana");
//		fila.offer("Bia"); // offer limita o tamanho da fila
//		fila.offer("Carlos");
//		fila.offer("Daniel");
//		fila.offer("Rafaela");
//		fila.offer("Gui");
		
		// Métodos de exibição de elementos da fila: peek e element
		// Ambos não os removem da fila 
		
		System.out.println(fila.peek()); // Exibindo o elemento da fila, nesse caso, o primeiro; Ana
		System.out.println(fila.peek()); // Continua exibindo o primeiro, pois não foi excluído
		//System.out.println(fila.element());
		//System.out.println(fila.element());
		
		
		
		
		

	}

}
