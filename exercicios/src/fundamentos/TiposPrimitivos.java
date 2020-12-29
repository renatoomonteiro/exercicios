package fundamentos;

public class TiposPrimitivos {

	public static void main (String[] args) {
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		// Underline separa casas decimais em 
		// n�meros grandes
		// A letra L, no final da vari�vel, 
		// indica que o n�mero � implicitamente
		// do tipo 'long'
		//Tipos num�ricos reais
		float salario = 11_445.44F;
		// A letra F, no final da vari�vel indica
		// que � implicitamente float.
		double vendasAcumuladas = 2_991_797_103.01;
		boolean estaDeFerias = true; 
		// Ou false, 0 ou 1 n�o s�o aceitos em Java 
		char status = 'A' ; // a de ativo, Tamb�m s�o aceitos
		//C�digos ASC
		// Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		// N�mero de viagens
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+": ganha ->" + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
