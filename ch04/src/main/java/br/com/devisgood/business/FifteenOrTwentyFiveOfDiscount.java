package br.com.devisgood.business;

public class FifteenOrTwentyFiveOfDiscount extends RuleOfCalculo {

	@Override
	protected int limit() {
		return 2500;
	}

	@Override
	protected double perCentAboveThanLimit() {
		// TODO Auto-generated method stub
		return 0.75;
	}

	@Override
	protected double perCentLesserThanLimit() {
		// TODO Auto-generated method stub
		return 0.85;
	}

}
