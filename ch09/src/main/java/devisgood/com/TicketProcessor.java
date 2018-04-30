package devisgood.com;

import java.util.List;

public class TicketProcessor {
	
	void process(Bill bill, List<Ticket> lTickets){
		
		for (Ticket t: lTickets){
			Payment payment = new Payment(t.getValue(), ModeOfPayment.TICKET);
			bill.addPayment(payment);
		}
		
	};

}
