package br.com.devisgood;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

	@Test
	public void withOneSymbol(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("I");
		Assert.assertEquals(1,res);

		res = romanNumberConverter.convert("V");
		Assert.assertEquals(5,res);

		res = romanNumberConverter.convert("X");
		Assert.assertEquals(10,res);

		res = romanNumberConverter.convert("L");
		Assert.assertEquals(50,res);

		res = romanNumberConverter.convert("C");
		Assert.assertEquals(100,res);

		res = romanNumberConverter.convert("D");
		Assert.assertEquals(500,res);

		res = romanNumberConverter.convert("M");
		Assert.assertEquals(1000,res);
	}

	@Test
	public void withTwoSymbols(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("XX");
		Assert.assertEquals(20, res);
		
		res = romanNumberConverter.convert("XV");
		Assert.assertEquals(15, res);
	}
	
	@Test
	public void withFourSymbolsSplitByTwo(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("XXII");
		Assert.assertEquals(22, res);
		
		res = romanNumberConverter.convert("XXVV");
		Assert.assertEquals(30, res);
	}
	
	@Test
	// MSN = Most Significant Number
	// LSB = Less Significant Number
	// example IX, I = MSB and X = LSN
	public void MSNLessThanLSN(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("IX");
		Assert.assertEquals(9, res);
	}
	
	public void withComplexNumbers(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("XXIV");
		Assert.assertEquals(24, res);
	}
}