package classe;

public class PrimeiroTrauma {
	
	int a = 3; // N�o pode mexer aqui!
	static int b = 4; // Membro de classe e est�tico consegue acessar outro membro
	
	public static void main(String[] args) {
        //int a = 3;
		//Pode mexer aqui
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a); //Pode mexer aqui
		//Pode mexer aqui
		System.out.println(b);
	}
}
