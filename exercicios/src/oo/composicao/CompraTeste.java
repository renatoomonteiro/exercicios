package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {


		Compra compra1 = new Compra(); // Cria��o da vari�vel compra1, que apontar� para a classe Compra
		
		//compra1.Cliente = Setando o nome para a vari�vel Cliente na classe Compra
		compra1.Cliente = "Jo�o Pedro";
		
		
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));  //  /
		compra1.adicionarItem(new Item("Boracha", 12, 3.89)); // | -> Passando os par�metros para o m�todo adicionarItem.
		compra1.adicionarItem(new Item("Caderno", 3, 18.79)); //  \
		
		System.out.println(compra1.itens.size()); // Exibindo o tamanho da lista de itens
		
		// S� para mostrar a rela��o bidirecional!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal(); 
		//Vari�vel do tipo double que receber� o total das compras 
		
		System.out.println("O valor total �: R$"+total); // Exibindo o valor total, atrav�s da vari�vel total
		
	}

}
