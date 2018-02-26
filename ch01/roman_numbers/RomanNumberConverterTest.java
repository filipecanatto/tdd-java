public class RomanNumberConverterTest{
import static org.junit.Assert.*;

	@Test
	public void WithOneSymbol(){
		RomanNumberConverter romanNumberConverter = new RomanNumberConverter();
		int res = romanNumberConverter.convert("I");
		assert.equals(1,res);

		res = romanNumberConverter.convert("V");
		assert.equals(5,res);

		res = romanNumberConverter.convert("X");
		assert.equals(10,res);

		res = romanNumberConverter.convert("L");
		assert.equals(50,res);

		res = romanNumberConverter.convert("C");
		assert.equals(100,res);

		res = romanNumberConverter.convert("D");
		assert.equals(500,res);

		res = romanNumberConverter.convert("M");
		assert.equals(1000,res);
	}

	@Test
	public void WithTwoSymbols(){
		RomanNumberConverter = new RomanNumberConverter();
		int res = RomanNumberConverter("XV");
		assert
	}
}