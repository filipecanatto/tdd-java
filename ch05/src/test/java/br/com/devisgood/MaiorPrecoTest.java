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
		CarrinhoDeCompras carrinho = new CarrinhoDeComprasBuilder().addItens(100, 200, 300).create();
		
		// then
		Assert.assertEquals(300, carrinho.calculaMaiorValor(), 0.0001);
	}
	

}
