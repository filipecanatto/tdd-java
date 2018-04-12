package br.com.devisgood;

public class CarrinhoDeComprasBuilder {
	
	CarrinhoDeCompras carrinhoDeCompras;
	
	public CarrinhoDeComprasBuilder(){
		carrinhoDeCompras = new CarrinhoDeCompras();
	}
	
	public CarrinhoDeComprasBuilder addItens(double ... valores){
		for (double valor : valores){
			carrinhoDeCompras.adiciona(new Item("item", 1, valor));
		}
		
		return this;
	}
	
	public CarrinhoDeCompras create(){
		return carrinhoDeCompras;
	}

}
