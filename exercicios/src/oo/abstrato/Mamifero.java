package oo.abstrato;

public abstract class Mamifero extends Animal{
	public abstract String mamar();
	
	@Override
	public String mover() {
		//M�todo final n�o pode ser sobrescrito 
		return "Saindo do lugar";
	}
}
