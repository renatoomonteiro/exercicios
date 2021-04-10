package controle;

import java.util.Scanner;

public class DoWile {
	public static void main(String[] args) {
		//if (condição)+{sentença}
		//while(condição)+{sentença}
		//for(condição/criação da variável; condição 1; condição 2) {sentença}
		//do {sentença} While(condição); finaliza com ;
		
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa dizer as palavras mágicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("Por favor"));
		
		entrada.close();
	
		
	}

}
