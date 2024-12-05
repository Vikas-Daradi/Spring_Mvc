package com.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.lms.entity.Employee;
import com.lms.repository.EmployeeRepository;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	public void addEmployee(Employee employee) {
		 employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		List<Employee>employees=employeeRepository.findAll();
		return employees;
	}

	public void deleteRegistration(long id) {
	employeeRepository.deleteById(id);
	
	
		
	}

	public Employee getEmployeeById(long id) {
	Employee employee =	employeeRepository.findById(id).get();
		return employee;
	}

	public void updateEmployee(Employee dto) {
		Employee employee= new Employee();
		employee.setId(dto.getId());
		employee.setName(dto.getName());
		employee.setEmailId(dto.getEmailId());
		employee.setMobile(dto.getMobile());
		employeeRepository.save(employee);
		
	}

		
	}


