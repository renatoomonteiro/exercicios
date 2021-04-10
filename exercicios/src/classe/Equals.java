package classe;

import java.util.Date;

public class Equals {
public static void main(String[] args) {
	Usuario u1 = new Usuario();
	u1.nome = "Pedro Silva";
	u1.email = "pedro.silva@ezemail.com.br"; 
	
	Usuario u2 = new Usuario();
	u2.nome = "Pedro Silva";
	u2.email = "pedro.silva@ezemail.com.br";
	
	System.out.println(u1==u2); // False, pq embora o conte�do seja igual, o endere�o de mem�ria � diferente
	System.out.println(u1.equals(u2)); // O .equals tem o mesmo resultado de ==
	System.out.println(u2.equals(u1));
	
	//System.out.println(u2.equals(new Date()));
	
	

	
	
}
}
