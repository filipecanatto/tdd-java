package br.com.devisgood.invoiceproblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

import br.com.devisgood.invoiceproblem.Invoice;
import br.com.devisgood.invoiceproblem.InvoiceDAO;
import br.com.devisgood.invoiceproblem.InvoiceGenerator;
import br.com.devisgood.invoiceproblem.Order;
import br.com.devisgood.invoiceproblem.SAP;
import br.com.devisgood.invoiceproblem.interfaces.ITable;
import junit.framework.Assert;

public class InvoiceGeneratorTest {
	
	@Test
	public void shouldGenerateInvoiceWithTaxDiscountUsingTable(){
		
		// given
		Order order = new Order("Filip", 900.0, 10);
		ITable table = Mockito.mock(Table.class);
		Mockito.when(table.getDiscount(order.getTotalValue())).thenReturn(0.2);
		List<ActionAfterGenerateInvoice> actions = Collections.emptyList();
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(actions, table);
		
		// when
		Invoice invoice = invoiceGenerator.generate(order);
		
		// then
		Mockito.verify(table).getDiscount(order.getTotalValue());
		Assert.assertEquals(order.getTotalValue() * 0.98, invoice.getTotalValue());
	}
	
	@Test
	public void shouldPersistTheInvoice(){
		
		// given
		ActionAfterGenerateInvoice dao = Mockito.mock(InvoiceDAO.class);
		List<ActionAfterGenerateInvoice> actions = Arrays.asList(dao);
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(actions);
		Order order = new Order("Marck", 1800.0, 10);
		
		// when
		Invoice invoice = invoiceGenerator.generate(order);
		
		// then
		Mockito.verify(dao).execute(invoice);
	}
	
	@Test
	public void shouldSendToSAP() {	
		
		// given
		ActionAfterGenerateInvoice sap = Mockito.mock(SAP.class);
		List<ActionAfterGenerateInvoice> actions = Arrays.asList(sap);
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator(actions);
		Order order = new Order("Lucke", 1800.0, 10);
		
		// when
		Invoice invoice = invoiceGenerator.generate(order);
		
		// then
		Mockito.verify(sap).execute(invoice);}

}
