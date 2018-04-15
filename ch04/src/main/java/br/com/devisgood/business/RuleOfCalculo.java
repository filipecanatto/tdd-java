package br.com.devisgood.business;

import br.com.devisgood.Employee;

public abstract class RuleOfCalculo {

	public Double calculate(Employee employee) {
		if (employee.getSalary() > limit()) {
			return (employee.getSalary() * perCentAboveThanLimit());
		} else {
			return (employee.getSalary() * perCentLesserThanLimit());
		}
	};

	protected abstract int limit();

	protected abstract double perCentAboveThanLimit();

	protected abstract double perCentLesserThanLimit();

}