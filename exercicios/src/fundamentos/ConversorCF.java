package fundamentos;

import java.util.*;

public class ConversorCF {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia a temperatura 
		 * em Celsius e converta para Fahrenheit.
		 * */

	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe a temperatura em C°: ");
	    double temp = entrada.nextDouble();
	    
	    temp = temp* 1.8+32;
	    
	    System.out.printf("A temperatura em F° é: %.2f" , temp);
			    
	    entrada.close(); 
		
	}

}
