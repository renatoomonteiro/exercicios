package oo.abstrato;

public class Cachorro extends Mamifero{
	//N�o precisa definir corpo de m�todos abstratos em classes abstratas
//	@Override
//	public String mover() {
//		return "Usando as patas";
//	}

	@Override
	public String mamar() {
		return "Usando leite";
	}

}
