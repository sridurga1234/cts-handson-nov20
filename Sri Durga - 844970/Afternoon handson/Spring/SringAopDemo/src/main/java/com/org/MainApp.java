package com.org;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("EmployeeService");
		service.delete();
		service.store();
		service.getAllEmployee(1, "sri");
		service.updateEmployees(1,"abc");
		service.getEmployee(5);
	}

}
