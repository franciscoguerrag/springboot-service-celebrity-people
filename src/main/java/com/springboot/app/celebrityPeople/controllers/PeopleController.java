package com.springboot.app.celebrityPeople.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.celebrityPeople.models.entity.Acquaintances;
import com.springboot.app.celebrityPeople.models.entity.Person;
import com.springboot.app.celebrityPeople.services.IAcuaintancesService;
import com.springboot.app.celebrityPeople.services.IPersonService;


@RestController
public class PeopleController {
	
	@Autowired
	private IPersonService iPersonService;
	
	@Autowired
	private IAcuaintancesService iAcuaintancesService;
	
	@GetMapping("/list")
	public List<Person> listPeople() {
		return iPersonService.findALL()
				.stream().map(person -> {
					person.setAcquaintances(iAcuaintancesService.findByParent(person.getId()));
					return person;
				}).collect(Collectors.toList());
	}
	
	@GetMapping("item/{id}")
	public Person item(@PathVariable Long id) throws Exception {
		Person person = iPersonService.findById(id);
		return person;
	}
	
	@PostMapping("/createPerson")
	@ResponseStatus(HttpStatus.CREATED)
	public Person crear(@RequestBody Person person) {
		return iPersonService.save(person);
	}
	
	@PostMapping("/createAcquaintance")
	@ResponseStatus(HttpStatus.CREATED)
	public Acquaintances crear(@RequestBody Acquaintances acquaintance) {
		return iAcuaintancesService.save(acquaintance);
	}
}
