package devisgood.com;

import java.util.ArrayList;
import java.util.List;

public class Bill {
	
	private List<Payment> payments = new ArrayList<>();
	private String client;
	private double value;
	private boolean status;
	
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}
	
	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Bill(String client, double value) {
		super();
		this.client = client;
		this.value = value;
	}
	
	public void addPayment(Payment payment){
		this.payments.add(payment);
		
		double total = 0;
		
		for (Payment p : payments){
			total += p.getValue();
		}
		
		// the bill was paid totally
		if (total >= value){
			this.status = true;
		}
	}
	}
	
	
	
	

