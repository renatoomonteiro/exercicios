package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {


		Compra compra1 = new Compra(); // Criação da variável compra1, que apontará para a classe Compra
		
		//compra1.Cliente = Setando o nome para a variável Cliente na classe Compra
		compra1.Cliente = "João Pedro";
		
		
		compra1.adicionarItem(new Item("Caneta", 20, 7.45));  //  /
		compra1.adicionarItem(new Item("Boracha", 12, 3.89)); // | -> Passando os parâmetros para o método adicionarItem.
		compra1.adicionarItem(new Item("Caderno", 3, 18.79)); //  \
		
		System.out.println(compra1.itens.size()); // Exibindo o tamanho da lista de itens
		
		// Só para mostrar a relação bidirecional!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal(); 
		//Variável do tipo double que receberá o total das compras 
		
		System.out.println("O valor total é: R$"+total); // Exibindo o valor total, através da variável total
		
	}

}
