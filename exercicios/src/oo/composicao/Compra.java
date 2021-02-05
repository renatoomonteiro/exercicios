package oo.composicao;

import java.util.ArrayList; //Importa��o da biblioteca ArrayList

public class Compra {
	
	String Cliente; // Vari�vel Cliente do tipo String, receber� o nome do cliente que realizar� a compra.
	// Rela��o 1 : N, onde uma compra possui muitos itens e um item tem uma compra.
	ArrayList<Item> itens = new ArrayList<Item>(); // ArrayList, que receber� uma lista de objetos do tipo classe Item.
	
	//M�todo adicionarItem, que receber� tr�s par�metros, 
	//nome, do tipo String
	//quantidade, do tipo int
	//preco, do tipo double

	//M�todo que recebe atributos
	void adicionarItem(String nome, int quantidade, double preco) { //Este m�todo est� chamando o m�todo de baixo
		this.adicionarItem(new Item(nome, quantidade, preco)); //Instanciando um objeto
	}	
	
		
	//M�todo que recebe item
	//M�todo adicionarItem, adiciona um item dentro da lista de Item
	void adicionarItem(Item item) { //M�todo chamado pelo m�todo de cima
		this.itens.add(item);
		item.compra=this; // Adiciona dentro da refer�ncia de compra, que � a vari�vel da classe Item
	}
	
	//Como os m�todos t�m o mesmo nome e par�metros diferentes, o Java executar� sem problemas.
	
	//Cria��o do m�todo obterValorTotal, que aumentar� o valor do item toda vez que for realizada uma compra 
	double obterValorTotal(){
		
		double total=0; //Cria��o da vari�vel total, sendo setada com 0.
		
		for(Item item: itens) { // Para a classe Item, identificada com a vari�vel item, que aponta apara a vari�vel do tipo
								//ArrayList itens...
			
			total+=item.quantidade*item.preco; // o total ser� igual a item, vari�vel quantidade, oriunda da classe Item
											   // Multiplicada pela vari�vel preco, tamb�m oriunda da classe Item
		}
		return total; //Retornando o total
	}
	
	
	

}
