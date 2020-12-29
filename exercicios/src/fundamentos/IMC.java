package fundamentos;

import java.util.*;

public class IMC { 
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o peso e a altura 
		 * do usuário e imprima no console o IMC.
		 * */
		  Scanner entrada = new Scanner(System.in);
		    
		    System.out.print("Informe o seu peso: ");
		    double peso = entrada.nextDouble();
		    
		    System.out.print("Informe a sua altura: ");
		    double alt = entrada.nextDouble();
		    
		    double imc = peso/(alt*alt);
		    
		    System.out.printf("O seu IMC é: %.2f " , imc);
		    
		    entrada.close();
		
	}

}


