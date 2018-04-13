package br.com.devisgood.business;

import br.com.devisgood.Employee;
import br.com.devisgood.enums.Position;

public class SalaryCalculator {
	
	public Double calculateSalary(Employee employee) {
		if (Position.DEVELOPER.equals(employee.getPosition())) {
			if (employee.getSalary() > 3000) {
				return employee.getSalary() * 0.8;
			}
			return employee.getSalary() * 0.9;
		} else if (Position.DBA.equals(employee.getPosition()) || Position.TESTER.equals(employee.getPosition())) {
			if (employee.getSalary() < 2500) {
				return employee.getSalary() * 0.85;
			}
			return employee.getSalary() * 0.75;
		}
		throw new RuntimeException("invalid employee");
	}

}
