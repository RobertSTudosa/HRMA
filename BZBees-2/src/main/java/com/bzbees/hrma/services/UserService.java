package com.bzbees.hrma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bzbees.hrma.dao.PersonRepository;
import com.bzbees.hrma.dao.UserRepository;
import com.bzbees.hrma.entities.Person;
import com.bzbees.hrma.entities.User;

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
