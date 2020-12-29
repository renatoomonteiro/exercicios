package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (°F - 32) X 5/9 = °C
		
		final int AJUSTE = -32;
		final double FATOR = 5.0/9.0;
		final int F = 90;
		double C = (F-32) * FATOR;
		
		System.out.println("Fórmula: (°"+F+AJUSTE+")X"+FATOR+"="+C);
		System.out.println("O resultado de "+F+"°F é: "+C+"°C.");

	}


}
