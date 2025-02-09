package com.demo.employee.Service;

import java.util.List;

import com.demo.employee.Model.Employee;

public interface EmployeeService {
	public Employee postEmp(Employee emp);
	public List<Employee> getAllEmployee();
	public void deleteEmployee(Long id);
	public Employee getEmployeeByid(Long id);

}
