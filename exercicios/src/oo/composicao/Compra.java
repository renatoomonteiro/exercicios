package oo.composicao;

import java.util.ArrayList; //Importação da biblioteca ArrayList

public class Compra {
	
	String Cliente; // Variável Cliente do tipo String, receberá o nome do cliente que realizará a compra.
	// Relação 1 : N, onde uma compra possui muitos itens e um item tem uma compra.
	ArrayList<Item> itens = new ArrayList<Item>(); // ArrayList, que receberá uma lista de objetos do tipo classe Item.
	
	//Método adicionarItem, que receberá três parâmetros, 
	//nome, do tipo String
	//quantidade, do tipo int
	//preco, do tipo double

	//Método que recebe atributos
	void adicionarItem(String nome, int quantidade, double preco) { //Este método está chamando o método de baixo
		this.adicionarItem(new Item(nome, quantidade, preco)); //Instanciando um objeto
	}	
	
		
	//Método que recebe item
	//Método adicionarItem, adiciona um item dentro da lista de Item
	void adicionarItem(Item item) { //Método chamado pelo método de cima
		this.itens.add(item);
		item.compra=this; // Adiciona dentro da referência de compra, que é a variável da classe Item
	}
	
	//Como os métodos têm o mesmo nome e parâmetros diferentes, o Java executará sem problemas.
	
	//Criação do método obterValorTotal, que aumentará o valor do item toda vez que for realizada uma compra 
	double obterValorTotal(){
		
		double total=0; //Criação da variável total, sendo setada com 0.
		
		for(Item item: itens) { // Para a classe Item, identificada com a variável item, que aponta apara a variável do tipo
								//ArrayList itens...
			
			total+=item.quantidade*item.preco; // o total será igual a item, variável quantidade, oriunda da classe Item
											   // Multiplicada pela variável preco, também oriunda da classe Item
		}
		return total; //Retornando o total
	}
	
	
	

}
