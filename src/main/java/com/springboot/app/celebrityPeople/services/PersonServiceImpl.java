package com.springboot.app.celebrityPeople.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.celebrityPeople.models.dao.PersonDao;
import com.springboot.app.celebrityPeople.models.entity.Person;

@Service
public class PersonServiceImpl implements IPersonService{
	
	@Autowired
	private PersonDao personDao;

	@Override
	@Transactional(readOnly = true)
	public List<Person> findALL() {
		return (List<Person>) personDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Person findById(Long id) {
		return personDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Person save(Person product) {
		return personDao.save(product);
	}
	
}
