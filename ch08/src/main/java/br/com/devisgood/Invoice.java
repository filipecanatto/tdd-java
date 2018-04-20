package br.com.devisgood;

import java.util.Calendar;

public class Invoice {
	
	private String Client;
	private String totalValue;
	private Calendar date;
	
	public Invoice(String client, String totalValue, Calendar date) {
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

	public String getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}
	
}
