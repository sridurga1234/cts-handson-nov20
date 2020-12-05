package com.org;

public class EmployeeServiceImpl implements  EmployeeService{
	private EmployeeDao employeedao;
	public void store() {
		
	}
	public void storeEmployee() {
		employeedao.store();
		System.out.println("storeEmployee() of service");		
	}
	

}
