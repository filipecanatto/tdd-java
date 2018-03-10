package br.com.devisgood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.devisgood.Item;

public class CarrinhoDeCompras {
	private List<Item> itens;

	public CarrinhoDeCompras() {
		this.itens = new ArrayList<Item>();
	}

	public void adiciona(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public double calculaMaiorValor(){
		if (getItens().size() == 0) return 0;
		
		double maior = getItens().get(0).getValorTotal();
		
		for (Item item :getItens()){
			if (maior < item.getValorTotal()) maior = item.getValorTotal();
		}
		
		return maior;
	}
}
