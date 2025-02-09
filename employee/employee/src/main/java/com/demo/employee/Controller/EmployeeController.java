package com.demo.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.Model.Employee;
import com.demo.employee.Service.EmployeeServiceImpl;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl empservice;
	
	@GetMapping("/test")
	public String Test()
	{
		return "TEst api saud";
	}
	
	@PostMapping("/employee")
	public Employee postEmployee(@RequestBody Employee employee)
	{
		return empservice.postEmp(employee);
	}
	
	@GetMapping("/employee/getall")
	public List<Employee> getAllEmployee()
	{
		return empservice.getAllEmployee();
		
	}
	
	@DeleteMapping("/Delete/{Id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable Long Id)
	{
		try {
			empservice.deleteEmployee(Id);
			return new ResponseEntity<>("Employee with id"  +Id + "deleted successfully", HttpStatus.OK);
		}catch(EntityNotFoundException e)
		{
			return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
			}
	}
	
	@GetMapping("/employee/get/{Id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable Long Id)
	{
		Employee emp=empservice.getEmployeeByid(Id);
		if(emp==null)return  ResponseEntity.notFound().build();
		return ResponseEntity.ok(emp);
	}
	
	
	

}
