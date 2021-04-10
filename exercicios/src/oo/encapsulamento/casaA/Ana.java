package oo.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused") // Suprimir advertência para variáveis que ainda não foram utilizadas
	// que é o caso da variável segredo
	
	private String segredo = "..."; //Nível de visibilidade privado, visível apenas nessa classe
	String facoDentroDeCasa = "..."; //Nível de visibilidade padrão, visível para qualquer classe do pacote
	protected String formaDeFalar = "...";//Nível de visibilidade transmitido por herança
	public String todosSabem = "..."; //Nível de visibilidade pública para qualquer pacote ou classe.
}
