package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; // final define como constante, sendo obrigat�rio o nome
		double area = PI*raio*raio; // da constante com letras mai�sculas.
		System.out.println(area);
		raio = 10;
		area = PI *raio*raio;
		System.out.println("�rea = " + area + "m�");
	}


}
