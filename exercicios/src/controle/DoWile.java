package controle;

import java.util.Scanner;

public class DoWile {
	public static void main(String[] args) {
		//if (condi��o)+{senten�a}
		//while(condi��o)+{senten�a}
		//for(condi��o/cria��o da vari�vel; condi��o 1; condi��o 2) {senten�a}
		//do {senten�a} While(condi��o); finaliza com ;
		
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa dizer as palavras m�gicas...");
			System.out.print("Quer sair?");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("Por favor"));
		
		entrada.close();
	
		
	}

}
