package fundamentos;
import java.util.*;


public class Ao2Ao3 {
	public static void main(String[] args) {
		
		
		/*
		 * Criar um programa que leia um valor 
		 * e apresente os resultados ao quadrado 
		 * e ao cubo do valor.
		 * */
		
		Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Informe um número: ");
	    double num1 = entrada.nextDouble();
	    
	    System.out.printf("O valor ao quadrado é: %.2f\n" , Math.pow(num1,2));
	    System.out.printf("O valor ao cubo é: %.2f" , Math.pow(num1,3));
	    entrada.close();
		
	}

}
