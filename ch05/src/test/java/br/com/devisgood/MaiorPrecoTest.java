package br.com.devisgood;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaiorPrecoTest {
	
	private CarrinhoDeCompras carrinhoDeCompras;
	
	@Before
	public void initialize() {
		this.carrinhoDeCompras = new CarrinhoDeCompras();
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoEstiverVazio(){
		
		//then
		Assert.assertEquals(0.0, carrinhoDeCompras.calculaMaiorValor(), 0.0001);
		
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinho1Elemento(){
		// given
		Item item = new Item("computador", 1, 1000);
		carrinhoDeCompras.adiciona(item);
		
		// then
		Assert.assertEquals(1000, carrinhoDeCompras.calculaMaiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDosItensSeCarrinhoNElementos(){
		// given
		CarrinhoDeCompras carrinho = new CarrinhoDeComprasBuilder().addItens(100, 200, 300).create();
		
		// then
		Assert.assertEquals(300, carrinho.calculaMaiorValor(), 0.0001);
	}
	

}
