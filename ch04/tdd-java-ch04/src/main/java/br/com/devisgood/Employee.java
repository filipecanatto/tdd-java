package br.com.devisgood;

import br.com.devisgood.enums.Position;

public class Employee {
	
	private String name;
	private double salary;
	private Position position;
	
	public Employee(String name, double salary, Position position) {
		super();
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
}
