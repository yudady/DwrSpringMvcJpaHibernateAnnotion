package com.tommy.demo.dao;

import com.tommy.base.dao.Dao;
import com.tommy.demo.model.Person;

public interface PersonDao extends Dao<Person>{

	Person persistPerson(Person person);
	
}
