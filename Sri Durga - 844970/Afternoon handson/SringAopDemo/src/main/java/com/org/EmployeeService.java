package com.org;
import java.util.List;

import org.springframework.stereotype.Service;
@Service

public class EmployeeService {
	private Employee emp;
	public void store() {
		System.out.println(" store() inside EmployeeService ");
	}
	
	public void delete() {
		System.out.println( "delete() inside EmployeeService ");
	}
	public String getAllEmployee(int n,String a)
	{
		System.out.println("it cintains int and string");
		return a;
				
	}
	public void getEmployee(int n){
		System.out.println("only int");
	}

	public void updateEmployees(int i, String string) {
		System.out.println("updated");
		// TODO Auto-generated method stub
		
	}
	
	
}
