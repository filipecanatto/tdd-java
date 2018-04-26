package br.com.devisgood.invoiceproblem;

import java.util.Calendar;

public class Invoice {
	
	private String Client;
	private double totalValue;
	private Calendar date;
	
	public Invoice(String client, double totalValue, Calendar date) {
		Client = client;
		this.totalValue = totalValue;
		this.date = date;
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

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
}
