package com.org;

public class Employee {
		 private int Id;
	 private String Name;
	 private double salary;
	public Employee(int id, String name, double salary) {
		super();
		Id = id;
		Name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", salary=" + salary + "]";
	}
	 
	 
	}


