public class romanNumberConverter{

private static Map<String, Integer> table = new HashMap <Character, Integer>{{
	put('I',1);
	put('V',5);
	put('X',10);
	put('L',50);
	put('C',100);
	put('D',500);
	put('M',1000);

}};

	public void convert(String romamNumber){
		int acumulator = 0;

		for (int i=0; i< romamNumber.lenght(); i++){
			acumulator = romamNumber+table.get(romamNumber.charAt(i));
		}

		return acumulator;

	}
}