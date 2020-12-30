package classe.desafio;

public class JantarResposta {
	public static void main(String[] args) {
		ComidaResposta c1 = new ComidaResposta("Arroz",0.223);
		ComidaResposta c2 = new ComidaResposta("Feijao",0.300 );
		
		PessoaResposta p = new PessoaResposta("João", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());  
		p.comer(c2);
		
		System.out.println(p.apresentar());
		
	}
}
