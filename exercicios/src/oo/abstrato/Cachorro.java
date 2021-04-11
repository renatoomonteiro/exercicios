package oo.abstrato;

public class Cachorro extends Mamifero{
	//Não precisa definir corpo de métodos abstratos em classes abstratas
//	@Override
//	public String mover() {
//		return "Usando as patas";
//	}

	@Override
	public String mamar() {
		return "Usando leite";
	}

}
