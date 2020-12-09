package com.example.empconfig.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.empconfig.Model.Emp;
import com.example.empconfig.Repo.EmpRepo;



@Service
public class EmpService {

	@Autowired
	private EmpRepo repo;
	
	public Emp addEmployee(Emp emp) {
		
		Emp e=repo.save(emp);
		return e;
	}
	
	public List<Emp> fetchAllEmployee(){
		
		List<Emp> list=new ArrayList<Emp>();
		
		list=repo.findAll();
		return list;
	}

	public Emp fetchEmployeeById(int id) {
			
		Optional<Emp> option= repo.findById(id);
		if(option.isPresent())
			return option.get();
		else
			return null;
	}
	
	public Emp updateEmployeeBasedOnSalary(int id, long salary) {
		
		Emp e= fetchEmployeeById(id);
		if(e!=null) {
			e.setSalary(salary);
			return repo.save(e);
		}
		else
			return null;
	}

	public List<Emp> deleteEmployee(int id) {
		
		repo.deleteById(id);
		List<Emp> list=fetchAllEmployee();
		return list;
	}


}
