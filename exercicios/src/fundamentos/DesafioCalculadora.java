package fundamentos;

import java.util.*;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();

		System.out.print("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite a operação desejada\n"
				+ "(Utilize + ; -; *; /; %): ");
		String op = entrada.next();
		
		System.out.println("O número " + num1 + " Mais o número " + num2 + " Ficará"
				+ " dessa forma " + num1 + op + num2 + " = " + (num1+num2) );
		
		/*
		 * System.out.println("A soma é: " + (num1+num2));
		 * System.out.println("A subtração é: " + (num1-num2));
		 * System.out.println("A multiplicação é: " + (num1*num2));
		 * System.out.println("A divisão é: " + (num1/num2));
		 * System.out.println("O mod é: " + (num1%num2));
		 */
		 
		entrada.close();
	}


}
