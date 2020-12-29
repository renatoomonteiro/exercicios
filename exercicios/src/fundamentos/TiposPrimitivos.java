package fundamentos;

public class TiposPrimitivos {

	public static void main (String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		// Underline separa casas decimais em 
		// números grandes
		// A letra L, no final da variável, 
		// indica que o número é implicitamente
		// do tipo 'long'
		//Tipos numéricos reais
		float salario = 11_445.44F;
		// A letra F, no final da variável indica
		// que é implicitamente float.
		double vendasAcumuladas = 2_991_797_103.01;
		boolean estaDeFerias = true; 
		// Ou false, 0 ou 1 não são aceitos em Java 
		char status = 'A' ; // a de ativo, Também são aceitos
		//Códigos ASC
		// Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numerosDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id+": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
