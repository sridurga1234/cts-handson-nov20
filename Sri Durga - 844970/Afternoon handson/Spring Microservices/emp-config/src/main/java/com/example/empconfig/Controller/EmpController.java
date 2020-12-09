package com.example.empconfig.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empconfig.Model.Emp;
import com.example.empconfig.Service.EmpService;



@RestController
@RequestMapping("employee")
public class EmpController {

	@Autowired
	private EmpService serv;
	
//	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	@PostMapping
	public Emp add(@RequestBody Emp e) {
		
		Emp employee=serv.addEmployee(e);
		return employee;
	}
	

	@GetMapping
	public List<Emp> getAllEmployee(){
		return serv.fetchAllEmployee();
	}

	@GetMapping(value="{employeeId}")
	public Emp getCustomerById(@PathVariable("employeeId")int id) {
		
		Emp employee=serv.fetchEmployeeById(id);
		return employee;
	}

	@PutMapping(value="{id}/{salary}")
	public Emp update(@PathVariable("id")int id, @PathVariable("salary")long salary) {
		
		Emp employee=serv.updateEmployeeBasedOnSalary(id, salary);
		return employee;
	}
	
	@DeleteMapping(value="{id}")
	public List<Emp> delete(@PathVariable("id")int id){
		
		List<Emp>list=serv.deleteEmployee(id);
		return list;
	}


}
public class EmpController {

}
