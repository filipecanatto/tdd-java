package devisgood.com;

public class Payment {
	
	private double value;
	private ModeOfPayment modeOfPayment;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public ModeOfPayment getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(ModeOfPayment modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public Payment(double value, ModeOfPayment modeOfPayment) {
		super();
		this.value = value;
		this.modeOfPayment = modeOfPayment;
	}
	
	
	
	
	
	
	
	

}
