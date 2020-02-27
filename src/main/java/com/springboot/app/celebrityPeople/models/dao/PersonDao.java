package com.springboot.app.celebrityPeople.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.springboot.app.celebrityPeople.models.entity.Person;

public interface PersonDao extends CrudRepository<Person, Long>{

}
