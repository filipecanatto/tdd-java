package br.com.devisgood.invoiceproblem;

public class Order {
	
	private String Client;
	private double totalValue;
	private int itensQty;
	
	
	public Order(String client, double totalValue, int itensQty) {
		Client = client;
		this.totalValue = totalValue;
		this.itensQty = itensQty;
	}


	public String getClient() {
		return Client;
	}


	public void setClient(String client) {
		Client = client;
	}


	public double getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}


	public int getItensQty() {
		return itensQty;
	}


	public void setItensQty(int itensQty) {
		this.itensQty = itensQty;
	}
}
