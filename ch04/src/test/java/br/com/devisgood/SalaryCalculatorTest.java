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
	
	@Test
	public void calculateDevSalaryAboveThanLimity() {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Employee employee = new Employee("Fernando", 4000.0, Position.DEVELOPER);
		
		Double salary = salaryCalculator.calculateSalary(employee);
		
		Assert.assertEquals(4000.0 * 0.8, salary, 0.00001);
		
	}
	
	@Test
	public void calculateDBASalaryLesserThanLimity() {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Employee employee = new Employee("George", 1500.0, Position.DBA);
		
		Double salary = salaryCalculator.calculateSalary(employee);
		
		Assert.assertEquals(1500.0 * 0.85, salary, 0.00001);
		
	}
	
	@Test
	public void calculateDBASalaryAboveThanLimity() {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Employee employee = new Employee("Francisco", 4500.0, Position.DBA);
		
		Double salary = salaryCalculator.calculateSalary(employee);
		
		Assert.assertEquals(4500.0 * 0.75, salary, 0.00001);
		
	}
	
	@Test
	public void calculateTesterSalaryLesserThanLimity() {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Employee employee = new Employee("Jhon", 1500.0, Position.TESTER);
		
		Double salary = salaryCalculator.calculateSalary(employee);
		
		Assert.assertEquals(1500.0 * 0.85, salary, 0.00001);
		
	}
	
	@Test
	public void calculateTesterSalaryAboveThanLimity() {
		SalaryCalculator salaryCalculator = new SalaryCalculator();
		Employee employee = new Employee("Joseph", 4500.0, Position.TESTER);
		
		Double salary = salaryCalculator.calculateSalary(employee);
		
		Assert.assertEquals(4500.0 * 0.75, salary, 0.00001);
		
	}

}
