package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); // Queue � fila, em ingl�s
		
		//Offer e Add: Adicionam elementos na fila
		//A diferen�a � quando a fila est� cheia!
//		fila.add("Ana");
//		fila.offer("Bia"); // offer limita o tamanho da fila
//		fila.offer("Carlos");
//		fila.offer("Daniel");
//		fila.offer("Rafaela");
//		fila.offer("Gui");
		
		// M�todos de exibi��o de elementos da fila: peek e element
		// Ambos n�o os removem da fila 
		
		System.out.println(fila.peek()); // Exibindo o elemento da fila, nesse caso, o primeiro; Ana
		System.out.println(fila.peek()); // Continua exibindo o primeiro, pois n�o foi exclu�do
		//System.out.println(fila.element());
		//System.out.println(fila.element());
		
		
		
		
		

	}

}
