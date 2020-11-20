package com.bzbees.hrma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bzbees.hrma.entities.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	
	@Override
	public List<User> findAll();

}
