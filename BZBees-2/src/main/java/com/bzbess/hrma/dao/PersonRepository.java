package com.bzbess.hrma.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bzbess.hrma.entities.Person;

@Repository
public interface PersonRepository extends CrudRepository <Person, Long>{

	
		public Person findPersonByPersonId(long id);

	
	

}
