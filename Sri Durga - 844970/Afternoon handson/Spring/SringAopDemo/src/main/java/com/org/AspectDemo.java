package com.org;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectDemo {
	@After("execution(public * com.org.EmployeeService.*(..))")
	public void log() {
		System.out.println("----- log method is called ------");
	}
	@After("execution(public * com.org.EmployeeService.*(int))")
	public void logInt() {
		System.out.println("int");
	}
	@After("execution(public * com.org.EmployeeService.*(int, *))")
	public void logIntAnyParam() {
		System.out.println("int with any other parameter");
	
	}
	@After("execution(public * com.org.EmployeeService.*(int , string))")
	public void logIntandString() {
		System.out.println("excute only int and String param");
	}
	@After("execution(public * com.org.EmployeeService.*(..))")
	public void logStringReturnType() {
		System.out.println("String as return type is executed");
	}
	

}
