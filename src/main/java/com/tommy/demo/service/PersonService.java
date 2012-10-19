package com.tommy.demo.service;

import com.tommy.demo.model.Person;

public interface PersonService {
	
	Person query(String id);
	
	void save(Person person);

	
}
