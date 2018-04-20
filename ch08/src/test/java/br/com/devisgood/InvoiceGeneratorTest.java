package br.com.devisgood;

import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class InvoiceGeneratorTest {
	
	@Test
	public void shouldGenerateInvoiceWithTaxDiscount(){
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Order order = new Order("Filip", 1200.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Assert.assertEquals(1200.0 * 0.94, invoice.getTotalValue());
	}
	
	@Test
	public void shouldPersistTheInvoice(){
		
		// create mock
		InvoiceDAO dao = Mockito.mock(InvoiceDAO.class);
		
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(dao);
		Order order = new Order("Marck", 1800.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Mockito.verify(dao).persist(order);
	}
	
	@Test
	public void shouldSendToSAP() {
		
		// create mock
		InvoiceDAO dao = Mockito.mock(InvoiceDAO.class);
		SAP sap = Mockito.mock(SAP.class);
		
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(dao, sap);
		Order order = new Order("Joe", 1850.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Mockito.verify(sap).send(invoice);
		
	}

}
