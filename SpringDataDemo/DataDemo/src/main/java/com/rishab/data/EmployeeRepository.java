package com.rishab.data;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	@Query("select e From Employee e where dept = ?1") List<Employee>findByJavaDept(String dept);
	@Query("select e From Employee e where dept = ?1 and desig =?2") List<Employee>findByJavaDeptAndDesig(String dept, String desig);
	@Query("select e From Employee e where dept = ?1 and desig =?2 and basic >?3") List<Employee>findByJavaDeptDesigAndBasic(String dept,String desig, Integer basic);
	@Query("select e From Employee e where dept = ?1 and basic <?2 and name like 'a%'") List<Employee>findByJavaDeptAndBasicLt5000(String dept,Integer basic);
	
}
