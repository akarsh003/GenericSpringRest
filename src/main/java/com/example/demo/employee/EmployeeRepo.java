package com.example.demo.employee;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import com.example.demo.common.ApplicationRepository;
import com.example.demo.model.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
//import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ApplicationRepository;
//import com.example.demo.model.Department;
import com.example.demo.model.Employee;


<<<<<<< HEAD:src/main/java/com/example/demo/employee/EmplRepo.java
@CrossOrigin()
//@RepositoryRestResource(exported=false/*excerptProjection = InlineRecordsEmployee.class*/)
public interface EmplRepo extends ApplicationRepository<Employee, Integer> {

//	
//	public Employee findBydeptid(int id);
//
//	public List<Employee> findById(Employee employee);

//		@RestResource
//		public Page<Employee> findBydeptid(int id,Pageable pageable);
//		@RestResource
//		public Page<Employee> findById(Employee employee,Pageable pageable);
//		public List<Employee> findById(int id);
	
//		Page<Employee> findByE(@Param("code")String code,Pageable pageable);
//		@RestResource
//		public Page<Employee> findAll(Pageable page);
//		@RestResource
//		public Page<T> findByname(String name,Pageable pageable);
//		@RestResource
//		Page<Employee> findAll(Specification spec,Pageable pageable);

//		public Page<T> findById(int id, Pageable pageable);
		
=======

interface EmployeeRepo extends ApplicationRepository<Employee, Integer> {
>>>>>>> d292bf44e661625dd603eaf69c8432598a4095da:src/main/java/com/example/demo/employee/EmployeeRepo.java
	
}
