package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.Cliente = "João Pedro";
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));  
		compra1.adicionarItem(new Item("Boracha", 12, 3.89));  
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));  
		
		System.out.println(compra1.itens.size());
		
		// Só para mostrar a relação bidirecional!
		double total = compra1.itens.get(0).compra
				.itens.get(1).compra.obterValorTotal();
		System.out.println("O valor total é: R$"+total);
		
	}

}
