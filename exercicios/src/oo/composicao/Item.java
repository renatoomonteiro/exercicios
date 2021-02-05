package oo.composicao;

public class Item {
	String nome;    //{ \
	int quantidade; //{  |> Criação das variáveis públicas
	double preco;   //{ /
	//Um item terá uma compra associada
	Compra compra; // Criação da variável compra, que apontará para a classe Compra
	
	
    	//Criação do método construtor Item, que receberá três parâmetros
		//String nome, que receberá a variável nome, da classe Item
		//int quantidade, que receberá a variável quantidade, da classe Item
		//double preco, que receberá a variávvel preco, da classe Item
		//É apenas um exemplo para ficar mais fácil de compreender, poderia ser uma variável de qualquer nome.
	Item(String nome, int quantidade, double preco){
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
