package oo.abstrato;

public abstract class Mamifero extends Animal{
	public abstract String mamar();
	
	@Override
	public String mover() {
		//Método final não pode ser sobrescrito 
		return "Saindo do lugar";
	}
}
