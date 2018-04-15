package br.com.devisgood.enums;

import br.com.devisgood.business.FifteenOrTwentyFiveOfDiscount;
import br.com.devisgood.business.RuleOfCalculo;
import br.com.devisgood.business.TenOrTwentyPerCentyOfDiscount;

public enum Position {
	DEVELOPER(new TenOrTwentyPerCentyOfDiscount()),
	DBA(new FifteenOrTwentyFiveOfDiscount()),
	TESTER(new FifteenOrTwentyFiveOfDiscount());
	
	private RuleOfCalculo ruleOfCalculo;
	
	Position(RuleOfCalculo ruleOfCalculo){
		this.ruleOfCalculo = ruleOfCalculo;
	}
	
	public RuleOfCalculo getRule(){
		return ruleOfCalculo;
	}
}
