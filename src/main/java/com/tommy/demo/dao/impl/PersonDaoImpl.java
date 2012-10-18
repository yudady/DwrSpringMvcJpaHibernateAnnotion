package com.tommy.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.tommy.base.dao.DaoImpl;
import com.tommy.demo.dao.PersonDao;
import com.tommy.demo.model.Person;

@Repository
public class PersonDaoImpl extends DaoImpl<Person> implements PersonDao {

	

	@Override
	public Person persistPerson(Person person) {
		log.debug("[LOG]PersonDaoImpl.persist()");
		return super.save(person);
	}


}
