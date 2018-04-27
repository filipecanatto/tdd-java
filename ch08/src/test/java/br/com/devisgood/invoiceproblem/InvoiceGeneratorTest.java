package br.com.devisgood.invoiceproblem;

import java.util.Arrays;
import java.util.List;

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
		
		List<ActionAfterGenerateInvoice> actions = null;
				
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(actions);
		Order order = new Order("Filip", 1200.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Assert.assertEquals(1200.0 * 0.94, invoice.getTotalValue());
	}
	
	@Test
	public void shouldPersistTheInvoice(){
		
		// create mock
		ActionAfterGenerateInvoice dao = Mockito.mock(InvoiceDAO.class);
		
		List<ActionAfterGenerateInvoice> actions = Arrays.asList(dao);
		
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(actions);
		Order order = new Order("Marck", 1800.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Mockito.verify(dao).execute(invoice);
	}
	
	@Test
	public void shouldSendToSAP() {	
		
		// create mock
		ActionAfterGenerateInvoice sap = Mockito.mock(SAP.class);
		
		List<ActionAfterGenerateInvoice> actions = Arrays.asList(sap);
		
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(actions);
		Order order = new Order("Marck", 1800.0, 10);
		
		Invoice invoice = invoiceGenerator.generate(order);
		
		Mockito.verify(sap).execute(invoice);}

}
