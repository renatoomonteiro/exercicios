package oo.composicao;

public class Item {
	String nome;    //{ \
	int quantidade; //{  |> Cria��o das vari�veis p�blicas
	double preco;   //{ /
	//Um item ter� uma compra associada
	Compra compra; // Cria��o da vari�vel compra, que apontar� para a classe Compra
	
	
    	//Cria��o do m�todo construtor Item, que receber� tr�s par�metros
		//String nome, que receber� a vari�vel nome, da classe Item
		//int quantidade, que receber� a vari�vel quantidade, da classe Item
		//double preco, que receber� a vari�vvel preco, da classe Item
		//� apenas um exemplo para ficar mais f�cil de compreender, poderia ser uma vari�vel de qualquer nome.
	Item(String nome, int quantidade, double preco){
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
