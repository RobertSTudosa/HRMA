package com.bzbees.hrma.dao;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.bzbees.hrma.BzBees1Application;
import com.bzbees.hrma.entities.User;
import com.bzbees.hrma.services.UserService;


@DataJpaTest
//@SpringBootTest
@ContextConfiguration(classes=BzBees1Application.class)
@RunWith(SpringRunner.class)
//@ExtendWith(SpringExtension.class)
//@SqlGroup({@Sql(executionPhase=ExecutionPhase.BEFORE_TEST_METHOD, scripts= {"classpath:schema.sql", "classpath:data.sql"}),
//			@Sql(executionPhase=ExecutionPhase.AFTER_TEST_METHOD, scripts= {"classpath:drop.sql"})})
public class UserRepositoryIntegrationTest {
	
	
	@Autowired
	UserService userServ;
	
	
	@Test
	public void ifNewUserSavedThenSuccess () {
		
		User newUser = new User( "testulica","test@test.com","passw0rd", false );
		System.out.println("New user is " + newUser.getUserName());
		
		userServ.save(newUser);
//		System.out.println("Number of users in the data test sql after save " + userServ.getAll().size());
		
		assertEquals(1, newUser.getUserId());
		
		
		
//		assertEquals(3, 3);
		
	}

}
