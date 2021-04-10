package fundamentos;
import java.util.*;
public class Wrapper {
	  public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
		    //byte
		    Byte b = 100;
		    Short s = 1000;
		    
		    
		    //Integer i = Integer.parseInt(entrada.next()); // int
		    Integer i = 10000; // int
		    long l = 100000L;
		    
		        
		    System.out.println(b.byteValue());
		    System.out.println(s.toString());
		    System.out.println(i*3);
		    System.out.println(l/3);
		    
		    //Float
		    
		    float f = 123.0F;
		    System.out.println(f);
		    
		    //Double
		    
		    Double d = 1234.5678;
		    System.out.println(d);
		    
		    Boolean bo = Boolean.parseBoolean("true");
		    System.out.println(bo);
		    System.out.println(bo.toString().toUpperCase());
		    
		    //Character
		    
		    Character c = '#';
		    System.out.println(c + "...");
		        
		    
		    entrada.close();
		        
		  }
}
