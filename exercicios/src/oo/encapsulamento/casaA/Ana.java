package oo.encapsulamento.casaA;

public class Ana {
	@SuppressWarnings("unused") // Suprimir advert�ncia para vari�veis que ainda n�o foram utilizadas
	// que � o caso da vari�vel segredo
	
	private String segredo = "..."; //N�vel de visibilidade privado, vis�vel apenas nessa classe
	String facoDentroDeCasa = "..."; //N�vel de visibilidade padr�o, vis�vel para qualquer classe do pacote
	protected String formaDeFalar = "...";//N�vel de visibilidade transmitido por heran�a
	public String todosSabem = "..."; //N�vel de visibilidade p�blica para qualquer pacote ou classe.
}
