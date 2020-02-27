package com.springboot.app.celebrityPeople.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.celebrityPeople.models.dao.AcquaintancesDao;
import com.springboot.app.celebrityPeople.models.entity.Acquaintances;
import com.springboot.app.celebrityPeople.models.entity.Person;

@Service
public class AcuaintancesServiceImpl implements IAcuaintancesService{
	
	@Autowired
	private AcquaintancesDao acquaintancesDao;

	@Override
	@Transactional(readOnly = true)
	public List<Acquaintances> findByParent(Long id) {
		return (List<Acquaintances>) acquaintancesDao.findByParent(id);
	}
	
	@Override
	@Transactional
	public Acquaintances save(Acquaintances acquaintance) {
		return acquaintancesDao.save(acquaintance);
	}

}
