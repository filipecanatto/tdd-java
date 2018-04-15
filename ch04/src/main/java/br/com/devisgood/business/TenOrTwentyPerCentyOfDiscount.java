package br.com.devisgood.business;

public class TenOrTwentyPerCentyOfDiscount extends RuleOfCalculo {

	@Override
	protected int limit() {
		return 3000;
	}

	@Override
	protected double perCentAboveThanLimit() {
		return 0.8;
	}

	@Override
	protected double perCentLesserThanLimit() {
		// TODO Auto-generated method stub
		return 0.9;
	}

}
