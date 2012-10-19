package com.tommy.demo.controller.employee;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tommy.demo.model.Employee;
import com.tommy.demo.service.EmployeeService;

/**
 * Handles and retrieves the main requests
 */
@Controller
@RequestMapping("/main/ajax")
public class EmployeeController {

	protected static Logger logger = Logger.getLogger("controller");

	@Inject
	private EmployeeService employeeService;

	
	@RequestMapping(value = "/employee/{employeeName}", method = RequestMethod.POST)
	public @ResponseBody Employee addEmployee(@PathVariable String employeeName) {
		
		Employee employee = new Employee();
		employee.setFirstName(employeeName);
		employee.setLastName("tommy");
		employee.setSalary(1000);
		
		employeeService.save(employee);
		
		return employee;
	}

}
