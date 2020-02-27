package com.springboot.app.celebrityPeople.services;

import java.util.List;

import com.springboot.app.celebrityPeople.models.entity.Person;

public interface IPersonService {
	
	public List<Person> findALL();
	public Person findById(Long id);
	public Person save(Person person);
	
}
