package br.com.devisgood;

import org.junit.Assert;
import org.junit.Test;
import br.com.devisgood.business.SalaryCalculator;
import br.com.devisgood.enums.Position;

public class SalaryCalculatorTest {
	
	@Test
	public void calculateDevSalaryLesserThanLimity() {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Employee employee = new Employee("Filipe", 1500.0, Position.DEVELOPER);
		
		Double salary = salaryCalculator.calculateSalary(employee);
		
		Assert.assertEquals(1500.0 * 0.9, salary, 0.00001);
		
	}

}
