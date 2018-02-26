package br.com.devisgood;
import java.util.*;

public class romanNumberConverter{

private static Map<Character, Integer> table = new HashMap <Character, Integer> (){{
	put('I',1);
	put('V',5);
	put('X',10);
	put('L',50);
	put('C',100);
	put('D',500);
	put('M',1000);

}};

	public int convert(String romamNumber){
		int acumulator = 0;
		int rightNumber = 0;

		// gets the actual number (right to left)
		for (int i = romamNumber.length() - 1; i>= 0; i--){
			int actual = table.get(romamNumber.charAt(i));
		
		
			// if the right number is higher than left number, so the actual number become negative
			int multiplier = 1;
			if (rightNumber > actual) multiplier = -1;
			
			acumulator += (actual * multiplier);
			
			// update right number
			rightNumber = actual;
		
		}

		return acumulator;

	}
}