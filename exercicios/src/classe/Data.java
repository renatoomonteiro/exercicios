package classe;

public class Data {
	int dia, ano,mes;
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);

		//variáveis locais precisam ser inicializadas, seão ricarão como zero
		//byte, short, int, long ->0 receberão valor zero, caso não seja atribuído
		// Float e double serám padrões 0.0.
		//boolean vem por padrão como false
		// char terá o primeiro elemento como sendo '\U0000'
		// String sem definição receberá Null

	}

	Data(int dia, int mes, int ano){
		this.dia = dia;// This serve para referenciar, já que os parâmetros têm o mesmo nome dos atributos
		this.mes = mes;
		this.ano = ano;
	}


	String obterDataFormatada(){
		final String formato = "%d/%d/%d"; // Variável fora do método
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}



}
