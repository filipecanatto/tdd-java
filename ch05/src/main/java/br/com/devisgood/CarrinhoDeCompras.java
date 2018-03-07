package br.com.devisgood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import br.com.devisgood.Item;

public	class	CarrinhoDeCompras	{
	private	List<Item>	itens;
	public	CarrinhoDeCompras()	{
					this.itens	=	new	ArrayList<Item>();
	}
	
	public	void	adiciona(Item	item)	{
		this.itens.add(item);
}
public	List<Item>	getItens()	{
		return	Collections.unmodifiableList(itens);
}
}
