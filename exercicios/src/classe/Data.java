package classe;

public class Data {
	int dia, ano,mes;
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);

		//vari�veis locais precisam ser inicializadas, se�o ricar�o como zero
		//byte, short, int, long ->0 receber�o valor zero, caso n�o seja atribu�do
		// Float e double ser�m padr�es 0.0.
		//boolean vem por padr�o como false
		// char ter� o primeiro elemento como sendo '\U0000'
		// String sem defini��o receber� Null

	}

	Data(int dia, int mes, int ano){
		this.dia = dia;// This serve para referenciar, j� que os par�metros t�m o mesmo nome dos atributos
		this.mes = mes;
		this.ano = ano;
	}


	String obterDataFormatada(){
		final String formato = "%d/%d/%d"; // Vari�vel fora do m�todo
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}



}
