package com.tommy.demo.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tommy.demo.dao.EmployeeDao;
import com.tommy.demo.model.Employee;
import com.tommy.demo.service.EmployeeService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao userDao;
	
	@Inject
	public void setUserDao(EmployeeDao userDao) {
		this.userDao = userDao;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(Employee employee){
		userDao.persistEmployee(employee);
	}

}
