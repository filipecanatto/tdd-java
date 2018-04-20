package br.com.devisgood;

import java.util.Calendar;



import br.com.devisgood.InvoiceDAO;

public class InvoiceGenerator {
	
	private InvoiceDAO dao;
	private SAP sap;
	
	public Invoice generate(Order order){
		Invoice invoice = new Invoice(order.getClient(), order.getTotalValue() * 0.94, Calendar.getInstance());
		
		dao.persist(order);
		sap.send(invoice);
		
		return invoice;
		
	}
	
	public InvoiceGenerator( InvoiceDAO dao, SAP sap) {
		this.dao = dao;
		this.sap = sap;
	}
	
	public InvoiceGenerator( InvoiceDAO dao) {
		this.dao = dao;
	}
	
	public InvoiceGenerator() {
		dao = new InvoiceDAO();
	}

}
