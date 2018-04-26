package br.com.devisgood.invoiceproblem;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.devisgood.invoiceproblem.Invoice;
import br.com.devisgood.invoiceproblem.InvoiceDAO;
import br.com.devisgood.invoiceproblem.InvoiceGenerator;
import br.com.devisgood.invoiceproblem.Order;
import br.com.devisgood.invoiceproblem.SAP;
import junit.framework.Assert;

public class InvoiceGeneratorTest {
	
	@Test
	public void shouldGenerateInvoiceWithTaxDiscount(){
		
		// create mock
		InvoiceDAO dao = Mockito.mock(InvoiceDAO.class);
		SAP sap = Mockito.mock(SAP.class);
				
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(dao, sap);
		Order order = new Order("Filip", 1200.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Assert.assertEquals(1200.0 * 0.94, invoice.getTotalValue());
	}
	
	@Test
	public void shouldPersistTheInvoice(){
		
		// create mock
		InvoiceDAO dao = Mockito.mock(InvoiceDAO.class);
		SAP sap = Mockito.mock(SAP.class);
		
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(dao, sap);
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
