package fundamentos;

import java.util.*;

public class DesafioCalculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		double num1 = entrada.nextDouble();

		System.out.print("Digite o segundo n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Digite a opera��o desejada\n"
				+ "(Utilize + ; -; *; /; %): ");
		String op = entrada.next();
		
		System.out.println("O n�mero " + num1 + " Mais o n�mero " + num2 + " Ficar�"
				+ " dessa forma " + num1 + op + num2 + " = " + (num1+num2) );
		
		/*
		 * System.out.println("A soma �: " + (num1+num2));
		 * System.out.println("A subtra��o �: " + (num1-num2));
		 * System.out.println("A multiplica��o �: " + (num1*num2));
		 * System.out.println("A divis�o �: " + (num1/num2));
		 * System.out.println("O mod �: " + (num1%num2));
		 */
		 
		entrada.close();
	}


}
