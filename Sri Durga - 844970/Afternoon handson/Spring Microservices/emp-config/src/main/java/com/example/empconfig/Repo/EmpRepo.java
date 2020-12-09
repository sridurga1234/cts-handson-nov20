package com.example.empconfig.Repo;


import java.util.List;
import java.util.Optional;

import com.example.empconfig.Model.Emp;

public interface EmpRepo extends JpaRepository<Emp,Integer>{

	Emp save(Emp emp);

	void deleteById(int id);

	Optional<Emp> findById(int id);

	List<Emp> findAll();

}