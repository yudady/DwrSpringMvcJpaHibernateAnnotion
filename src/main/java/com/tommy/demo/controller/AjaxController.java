package com.tommy.demo.controller;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tommy.demo.model.Employee;
import com.tommy.demo.model.Person;
import com.tommy.demo.service.EmployeeService;
import com.tommy.demo.service.PersonService;

/**
 * Handles and retrieves the main requests
 */
@Controller
@RequestMapping("/main/ajax")
public class AjaxController {

	protected static Logger logger = Logger.getLogger("controller");

	@Inject
	private PersonService personService;
	@Inject
	private EmployeeService employeeService;

	/**
	 * ajax page
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getAjaxPage() {
		logger.debug("[LOG]AjaxController.getAjaxPage()");

		return new ModelAndView("ajax");
	}
	
	
	@RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
	public @ResponseBody String queryPerson(@PathVariable String id) {
		logger.debug("[LOG]AjaxController.queryPerson()");
		logger.debug("[LOG][id]" + id);
		Person p = personService.query(id) ;
		return p.toString();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody String addPerson(String personName) {
		logger.debug("[LOG]AjaxController.addPerson()");
		
		Person p = new Person();
		p.setName(personName);
		personService.save(p);
		
		return p.toString();
	}
	
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
