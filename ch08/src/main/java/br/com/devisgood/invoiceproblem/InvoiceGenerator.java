package br.com.devisgood.invoiceproblem;

import java.util.Calendar;
import java.util.List;

public class InvoiceGenerator {
	
	private List<ActionAfterGenerateInvoice> actions;
	
	public InvoiceGenerator(List<ActionAfterGenerateInvoice> actions) {
		this.actions = actions;
	}
	
	public Invoice generate(Order order){
		Invoice invoice = new Invoice(order.getClient(), order.getTotalValue() * 0.94, Calendar.getInstance());
		
		if (actions != null) {
			for (ActionAfterGenerateInvoice action : actions) {
				action.execute(invoice);
			}
		}
		
		return invoice;
		
	}
	

}
