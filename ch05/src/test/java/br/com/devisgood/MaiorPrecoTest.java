package br.com.devisgood;

import org.junit.Assert;
import org.junit.Test;

public class MaiorPrecoTest {
	
	@Test
	public void deveRetornarZeroSeCarrinhoEstiverVazio(){
		// given
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		//then
		Assert.assertEquals(0.0, carrinhoDeCompras.calculaMaiorValor(), 0.0001);
		
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinho1Elemento(){
		// given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Item item = new Item("computador", 1, 1000);
		carrinho.adiciona(item);
		
		// then
		Assert.assertEquals(1000, carrinho.calculaMaiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDosItensSeCarrinhoNElementos(){
		// given
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(new Item("computador", 1, 1000));
		carrinho.adiciona(new Item("mesa", 2, 500));
		carrinho.adiciona(new Item("cadeira", 4, 250));
		
		// then
		Assert.assertEquals(1000.00, carrinho.calculaMaiorValor(), 0.0001);
	}
	

}
