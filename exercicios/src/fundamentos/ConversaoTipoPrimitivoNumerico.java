package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	  public static void main(String[] args) {
		    
		   double a = 1; // Convers�o impl�cita de double para int
		   System.out.println(a);
		    
		   //float b = 1.0F; // Tornando o literal em float com o aletra F no final do n�mero
		   
		    float b = (float) 1.123456788888; // Convers�o expl�cita (CAST)
		    System.out.println(b); 
		    
		    int c = 340;
		    byte d = (byte) c; // Converte antes de armazenar em c
		    System.out.println(d);
		    
		    double e = 1.999999;
		    int f = (int) e;
		    System.out.println(f);
		    
		  }
}
