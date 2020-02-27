package com.springboot.app.celebrityPeople.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="people")
public class Person implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementals
	private long id;

	private String name;
	
	@Transient
	private List<Acquaintances> acquaintances;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Acquaintances> getAcquaintances() {
		return acquaintances;
	}
	public void setAcquaintances(List<Acquaintances> acquaintances) {
		this.acquaintances = acquaintances;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", acquaintances=" + acquaintances + "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6970238370618933600L;


}
