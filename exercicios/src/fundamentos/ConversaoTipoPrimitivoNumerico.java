package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	  public static void main(String[] args) {
		    
		   double a = 1; // Conversão implícita de double para int
		   System.out.println(a);
		    
		   //float b = 1.0F; // Tornando o literal em float com o aletra F no final do número
		   
		    float b = (float) 1.123456788888; // Conversão explícita (CAST)
		    System.out.println(b); 
		    
		    int c = 340;
		    byte d = (byte) c; // Converte antes de armazenar em c
		    System.out.println(d);
		    
		    double e = 1.999999;
		    int f = (int) e;
		    System.out.println(f);
		    
		  }
}
