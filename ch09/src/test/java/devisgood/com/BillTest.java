package devisgood.com;

import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class BillTest {
	
	@Test
	public void shouldAssignStatusAsPaid() {

		// given
		TicketProcessor tp = new TicketProcessor(); // processador de boletos
		Bill bill = new Bill("Client x", 150.0); // fatura
		Ticket ticket = new Ticket(150.0); // boleto
		List<Ticket> lTicket = Arrays.asList(ticket);

		// when
		tp.process(bill, lTicket);

		// then
		Assert.assertEquals(true, bill.isStatus());

	}

}
