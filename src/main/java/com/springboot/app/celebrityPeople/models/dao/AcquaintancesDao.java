package com.springboot.app.celebrityPeople.models.dao;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springboot.app.celebrityPeople.models.entity.Acquaintances;

public interface AcquaintancesDao extends CrudRepository<Acquaintances, Long>{

	@Query("SELECT a FROM Acquaintances a where a.parentId = :id") 
	public List<Acquaintances> findByParent(@Param("id") Long id);
	
}
