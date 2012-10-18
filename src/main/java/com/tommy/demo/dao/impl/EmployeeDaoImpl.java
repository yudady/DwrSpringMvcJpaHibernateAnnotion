package com.tommy.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.tommy.base.dao.DaoImpl;
import com.tommy.demo.dao.EmployeeDao;
import com.tommy.demo.model.Employee;

@Repository
public class EmployeeDaoImpl extends DaoImpl<Employee> implements EmployeeDao {

	@Override
	public Employee persistEmployee(Employee employee) {
		log.debug("[LOG]UserDaoImpl.persist()");
		return super.save(employee);
	}

}
