package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lms.dto.EmployeeDto;
import com.lms.entity.Employee;
import com.lms.service.EmployeeService;
import com.lms.util.EmailService;

//businesss logic

@Controller
public class EmployeeController {
	
	@Autowired
	private EmailService emailService;
	
	
	@Autowired
	private EmployeeService employeeService;
	
	//handler method
	
	//https://localhost:8080/view
	
	@RequestMapping("/view")	
	public String viewCreateRegistrationPage() {
		return "create_employee";
		
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(EmployeeDto dto,ModelMap model) 
	{
		Employee employee=new Employee();
		employee.setName(dto.getName());
		employee.setEmailId(dto.getEmailId());
		employee.setMobile(dto.getMobile());
		employeeService.addEmployee(employee);
		
		
		emailService.sendEmail(dto.getEmailId(),"welcome", "hi welcome to..dto..");

		
		model.addAttribute("msg","record is save");
		
		return "create_employee";
	}
	@RequestMapping("/getAllEmp")
	public String getAllEmp(Model model) {
	List<Employee> employees =employeeService.getAllEmployees();
	model.addAttribute("employees",employees);
	return "list_employees";
		
	}
	@RequestMapping("/deleteReg")
	public String deleteReg(@RequestParam long id ,Model model) {
		employeeService.deleteRegistration(id);
		List<Employee> employees =employeeService.getAllEmployees();
		model.addAttribute("employees",employees);
		return "list_employees";
	}
	@RequestMapping("/updateReg")
	public String updateReg(@RequestParam long id, Model model) {
		Employee employee= employeeService.getEmployeeById(id);
		model.addAttribute("employee",employee);
		return "update_employee";
		
	}
	@RequestMapping("/updateEmployee")
	public String updateRegistration(Employee dto,Model model) {
		employeeService.updateEmployee(dto);
		
		List<Employee> employees =employeeService.getAllEmployees();
		model.addAttribute("employees",employees);
		return "list_employees";
		
	}
}

