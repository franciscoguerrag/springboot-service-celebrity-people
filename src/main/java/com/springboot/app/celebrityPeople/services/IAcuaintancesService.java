package com.springboot.app.celebrityPeople.services;

import java.util.List;


import com.springboot.app.celebrityPeople.models.entity.Acquaintances;

public interface IAcuaintancesService {
	
	public List<Acquaintances> findByParent(Long id);
	Acquaintances save(Acquaintances acquaintance);
}
