package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<String>(); // <String> significa que � uma lista que aceitar� valores do tipo string,
		//(Entre " ") HashSet = Exibi��o Desordenada
		SortedSet<String> listaAprovados = new TreeSet<String>(); // Garante a ordem da exibi��o seja a mesma da inser��o
		// SortedSet = Lista de conjunto que aceita ordena��o
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String candidato: listaAprovados) {
			
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			
			System.out.println(n);
		}
	
		
		
	}
}
