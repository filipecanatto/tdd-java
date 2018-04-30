package devisgood.com;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class TicketProcessorTest {
	
	@Test
	public void shouldProcessTicketWithSinglePayment(){
		
		// given
		TicketProcessor tp = new TicketProcessor(); // processador de boletos
		Bill bill = new Bill("Client x", 150.0); // fatura
		Ticket ticket = new Ticket(150.0); // boleto
		List<Ticket> lTicket = Arrays.asList(ticket);
		
		// when
		tp.process(bill, lTicket);
		
		// then
		Assert.assertEquals(1, bill.getPayments().size());
		Assert.assertEquals(bill.getValue(), bill.getPayments().get(0).getValue());
		
	}
	
	@Test
	public void shouldProcessTicketWithNPayments(){
		
		//given 
		TicketProcessor tp = new TicketProcessor(); // processador de boletos
		Bill bill = new Bill("Client y", 150.0); // fatura
		Ticket ticket1 = new Ticket(100.0); // boleto
		Ticket ticket2 = new Ticket(50.0); 
		List<Ticket> lTicket = Arrays.asList(ticket1, ticket2);
		
		// when
		tp.process(bill, lTicket);
				
		// then
		Assert.assertEquals(2, bill.getPayments().size());
		Assert.assertEquals(100.0, bill.getPayments().get(0).getValue(), 0.00001);
		Assert.assertEquals(50.0, bill.getPayments().get(1).getValue(), 0.00001);
	}

}
