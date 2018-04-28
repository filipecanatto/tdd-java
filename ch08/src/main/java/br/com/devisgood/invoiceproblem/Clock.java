package br.com.devisgood.invoiceproblem;

import java.util.Calendar;

import br.com.devisgood.invoiceproblem.interfaces.IClock;

public class Clock implements IClock {

	@Override
	public Calendar getToday() {
	
		return Calendar.getInstance();
	}

}
