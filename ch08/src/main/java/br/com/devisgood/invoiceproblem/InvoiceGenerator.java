package br.com.devisgood.invoiceproblem;

import java.util.Calendar;
import java.util.List;

import br.com.devisgood.invoiceproblem.interfaces.IClock;
import br.com.devisgood.invoiceproblem.interfaces.ITable;

public class InvoiceGenerator {
	
	private List<ActionAfterGenerateInvoice> actions;
	private ITable table;
	private IClock clock;
	
	public InvoiceGenerator(List<ActionAfterGenerateInvoice> actions) {
		this.actions = actions;
	}
	
	public InvoiceGenerator(List<ActionAfterGenerateInvoice> actions, ITable table) {
		this.actions = actions;
		this.table = table;
	}
	
	public InvoiceGenerator(List<ActionAfterGenerateInvoice> actions, IClock clock) {
		this.actions = actions;
		this.clock = clock;
	}
	
	public Invoice generate(Order order){
		Invoice invoice = new Invoice(order.getClient(),
				(order.getTotalValue() * table.getDiscount(order.getTotalValue())),
				 clock.getToday());
		
		if (actions != null) {
			for (ActionAfterGenerateInvoice action : actions) {
				action.execute(invoice);
			}
		}
		
		
		return invoice;
		
	}
	

}
