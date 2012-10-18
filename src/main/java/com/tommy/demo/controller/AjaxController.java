package com.tommy.demo.controller;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	 * Handles and retrieves the AJAX Add page
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView getAjaxAddPage() {
		logger.debug("Received request to show AJAX, add page");

		Person p = new Person();
		p.setName("tommy");
		personService.save(p);

		Employee employee = new Employee();
		employee.setFirstName("lin");
		employee.setLastName("tommy");
		employee.setSalary(1000);

		employeeService.save(employee);

		return new ModelAndView("ajax-add-page");
	}

}
