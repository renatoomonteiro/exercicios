package controle;

import java.util.Scanner;

public class ExerRecNum {
	public static void main(String[] args) {
		//Criar um programa que receba um nu�mero e verifique se ele est� entre 0 e 10 e e� par;


		Scanner entrada = new Scanner(System.in);
		//Importar a biblioteca: ctrl+shift+o
		System.out.println("Informe o n�mero");
		int valor = entrada.nextInt();

		if(valor<0 || valor>10) {
			System.out.println("Informe um n�mero entre 0 e 10");	
		}else{
			System.out.println("O valor �: "+valor);
		}
		if(valor%2==1) {
			System.out.println("O valor � �mpar!");
		}
		if(valor%2==0) {
			System.out.println("O valor � par");
		}
		entrada.close();	
	}

}



