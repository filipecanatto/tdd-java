package br.com.devisgood;

import org.junit.Assert;
import org.junit.Test;

public class MaiorPrecoTest {
	
	@Test
	public void deveRetornarZeroSeCarrinhoEstiverVazio(){
		// given
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		// when
		MaiorPreco algoritimo = new MaiorPreco();
		double valor = algoritimo.encontra(carrinhoDeCompras);
		
		//then
		Assert.assertEquals(0.0, valor, 0.0001);
		
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinho1Elemento(){
		// given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Item item = new Item("computador", 1, 1000);
		carrinho.adiciona(item);
		
		//when
		MaiorPreco algoritimo = new MaiorPreco();
		double valor = algoritimo.encontra(carrinho);
		
		// then
		Assert.assertEquals(1000, valor, 0.0001);
	}
	
	@Test
	public void deveRetornarValorDosItensSeCarrinhoNElementos(){
		// given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Item("computador", 1, 1000));
		carrinho.adiciona(new Item("mesa", 2, 500));
		carrinho.adiciona(new Item("cadeira", 4, 250));
		
		//when
		MaiorPreco algoritimo = new MaiorPreco();
		double valor = algoritimo.encontra(carrinho);
		
		// then
		Assert.assertEquals(1250.00, valor, 0.0001);
	}
	

}
