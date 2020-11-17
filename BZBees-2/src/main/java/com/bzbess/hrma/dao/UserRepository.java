package com.bzbess.hrma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bzbess.hrma.entities.User;

@Repository
public interface UserRepository extends CrudRepository <User, Long> {
	
	@Override
	public List<User> findAll();

}
