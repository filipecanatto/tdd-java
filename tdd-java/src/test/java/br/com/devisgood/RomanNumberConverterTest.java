package br.com.devisgood;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

import br.com.devisgood.RomanNumberConverter;

public class RomanNumberConverterTest extends TestCase{

	@Test
	public void withOneSymbol(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("I");
		assertEquals(1,res);

		res = romanNumberConverter.convert("V");
		assertEquals(5,res);

		res = romanNumberConverter.convert("X");
		assertEquals(10,res);

		res = romanNumberConverter.convert("L");
		assertEquals(50,res);

		res = romanNumberConverter.convert("C");
		assertEquals(100,res);

		res = romanNumberConverter.convert("D");
		assertEquals(500,res);

		res = romanNumberConverter.convert("M");
		assertEquals(1000,res);
	}

	@Test
	public void withTwoSymbols(){
		RomanNumberConverter = new RomanNumberConverter();
		int res = RomanNumberConverter("XX");
		assertEquals(20, res);
		
		res = RomanNumberConverter("XV");
		assertEquals(15, res);
	}
	
	@Test
	public void withFourSymbolsSplitByTwo(){
		RomanNumberConverter = new RomanNumberConverter();
		int res = RomanNumberConverter("XXII");
		assertEquals(22, res);
		
		res = RomanNumberConverter("XXVV");
		assertEquals(30, res);
	}
	
	@Test
	// MSN = Most Significant Number
	// LSB = Less Significant Number
	// example IX, I = MSB and X = LSN
	public void MSNLessThanLSN(){
		RomanNumberConverter = new RomanNumberConverter();
		int res = RomanNumberConverter("IX");
		assertEquals(9, res);
	}
	
	public void withComplexNumbers(){
		RomanNumberConverter = new RomanNumberConverter();
		int res = RomanNumberConverter("XXIV");
		assertEquals(24, res);
	}
}