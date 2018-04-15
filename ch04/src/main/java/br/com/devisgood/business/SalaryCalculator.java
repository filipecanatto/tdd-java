package br.com.devisgood.business;

import br.com.devisgood.Employee;
import br.com.devisgood.enums.Position;

public class SalaryCalculator {

	// calculate the salary discount
	public Double calculateSalary(Employee employee) {
		return employee.getPosition().getRule().calculate(employee);
	}

}
