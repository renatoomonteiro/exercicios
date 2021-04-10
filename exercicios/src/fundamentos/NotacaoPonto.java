package fundamentos;

public class NotacaoPonto {
	public static void main (String[] args) {
		
		String s = "Bom dia! X";
		s = s.concat("!!!");
		// Quando a variável for do tipo texto,
		// 'string', deverá ser escrita com a 
		// inicial maiúscula.
		s = s.replace("X", "Senhora"); 
		// replace troca o primeiro parâmetro
		// pelo segundo
		s = s.toUpperCase();//Método que 
		//converte todo o texto em letras maiúsculas
		System.out.println(s);
		//System.out.println("leo".toUpperCase());
		// O tratamento de maúsculo pode ser feito
		// dendro do método de exibição
		// SYSO
		String x = "Leo"
				.toUpperCase();
		System.out.println(x);
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		//Exemplos de quebra de linha após o operador 
		//ponto '.' 
		System.out.println(y);
		// Tipos primitivos não têm o operador ponto "."
		
		
	}

}
