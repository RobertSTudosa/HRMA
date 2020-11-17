package com.bzbess.hrma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bzbess.hrma.dao.PersonRepository;
import com.bzbess.hrma.dao.UserRepository;
import com.bzbess.hrma.entities.Person;
import com.bzbess.hrma.entities.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userAccountRepo;
	
	@Autowired
	PersonRepository persRepo;
	
	public User save (User userAccount) {
		return userAccountRepo.save(userAccount);
	}
	
	public User saveUserAccountAndPerson(User userAccount, Person person) {
		
		persRepo.save(person);
		return userAccountRepo.save(userAccount);
		
	}
	
	public List<User> getAll() {

		return (List<User>)  userAccountRepo.findAll();
	}
	


}
