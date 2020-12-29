package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		//Digitar domingo e o programa retornar� 1
		//Digitar segunda e o programa retornar� 2

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next();

		if(dia.equalsIgnoreCase("domingo")) { // equalsIgnoreCase: ignora se � mai�scula ou min�scula
			System.out.println(1); 
		}else {
			if(dia.equalsIgnoreCase("segunda")) {
				System.out.println(2);
			}else {
				if(dia.equalsIgnoreCase("ter�a")
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
								if(dia.equalsIgnoreCase("s�bado")
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
