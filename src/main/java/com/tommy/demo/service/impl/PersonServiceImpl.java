package com.tommy.demo.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tommy.demo.dao.PersonDao;
import com.tommy.demo.model.Person;
import com.tommy.demo.service.PersonService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PersonServiceImpl implements PersonService {

	private PersonDao personDao;
	
	@Inject
	public void setUserDao(PersonDao personDao) {
		this.personDao = personDao;
	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void save(Person person) {
		List<Person> persons = personDao.findAll(Person.class);
		System.out.println("[LOG]" + persons);
		personDao.persistPerson(person);
	}

}
