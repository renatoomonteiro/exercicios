package fundamentos;

public class NotacaoPonto {
	public static void main (String[] args) {
		
		String s = "Bom dia! X";
		s = s.concat("!!!");
		// Quando a vari�vel for do tipo texto,
		// 'string', dever� ser escrita com a 
		// inicial mai�scula.
		s = s.replace("X", "Senhora"); 
		// replace troca o primeiro par�metro
		// pelo segundo
		s = s.toUpperCase();//M�todo que 
		//converte todo o texto em letras mai�sculas
		System.out.println(s);
		//System.out.println("leo".toUpperCase());
		// O tratamento de ma�sculo pode ser feito
		// dendro do m�todo de exibi��o
		// SYSO
		String x = "Leo"
				.toUpperCase();
		System.out.println(x);
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		//Exemplos de quebra de linha ap�s o operador 
		//ponto '.' 
		System.out.println(y);
		// Tipos primitivos n�o t�m o operador ponto "."
		
		
	}

}
