package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;

	public Ferrari() {
		this(315);
		// TODO Auto-generated constructor stub
	}

	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	
	
	@Override
	public void ligarAr() {
		ligarAr = true; 
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;	
		}else if (ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}
		return 15;
	}

	//@Override significa sobrescrever o método na classe pai
	//	void acelerar() {
	////		velocidadeAtual+=15;
	//		super.acelerar();
	//	}
	//		//Invocar o construtor passando os parâmetros de forma explícita

}