package fundamentos;

import java.util.*;

public class ConversorFC {
	public static void main(String[] args) {
		
		/*
		 * Criar um programa que leia a temperatura em 
		 * Fahrenheit e converta para Celsius.
		 * */
		
		  Scanner entrada = new Scanner(System.in);
		    
		    System.out.print("Informe a temperatura em F°: ");
		    double temp = entrada.nextDouble();
		    
		    temp = (temp-32)/ 1.8;
		    
		    System.out.printf("A temperatura em C° é: %.2f " , temp);
				    
		    entrada.close();
		
	}

}
