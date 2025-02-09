package com.demo.employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.employee.Model.Employee;
import com.demo.employee.Repository.EmployeeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private  EmployeeRepository emplrepo;
	
	public Employee postEmp(Employee emp)
	{
		return emplrepo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return  emplrepo.findAll();
	}

	@Override
	public void deleteEmployee(Long id) {
		if(!emplrepo.existsById(id))
		{
			throw new EntityNotFoundException("Employee with id"+id + "not found");
		}
		emplrepo.deleteById(id);
		
	}

	@Override
	public Employee getEmployeeByid(Long id) {
		// TODO Auto-generated method stub
		return emplrepo.findById(id).orElse(null);
	}

	public Employee updateEmployee(Long id,Employee eemp)
	{
		return eemp;
		
	}
	
	
	

}
