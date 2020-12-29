package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		//Digitar domingo e o programa retornará 1
		//Digitar segunda e o programa retornará 2

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next();

		if(dia.equalsIgnoreCase("domingo")) { // equalsIgnoreCase: ignora se é maiúscula ou minúscula
			System.out.println(1); 
		}else {
			if(dia.equalsIgnoreCase("segunda")) {
				System.out.println(2);
			}else {
				if(dia.equalsIgnoreCase("terça")
						|| "terca".equalsIgnoreCase(dia)) {
					System.out.println(3);
				}else {
					if(dia.equalsIgnoreCase("quarta")) {
						System.out.println(4);
					}else {
						if(dia.equalsIgnoreCase("quinta")) {
							System.out.println(5);
						}else {
							if(dia.equalsIgnoreCase("sexta")) {
								System.out.println(6);
							}else {
								if(dia.equalsIgnoreCase("sábado")
										|| "sabado".equalsIgnoreCase(dia)) {
									System.out.println(7);
								} 
							}
						}
					}
				}
			}
		}

		entrada.close();
	}
}
