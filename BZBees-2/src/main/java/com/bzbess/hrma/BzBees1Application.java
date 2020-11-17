package com.bzbess.hrma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bzbess.hrma.services.UserService;

@SpringBootApplication
@ComponentScan({"com.bzbess.hrma.controllers","com.bzbess.hrma.dao","com.bzbess.hrma.dto",
	"com.bzbess.hrma.entities", "com.bzbess.hrma.services"})
public class BzBees1Application {
	
	@Autowired
	UserService userServ;
	
	public static void main(String[] args) {
		SpringApplication.run(BzBees1Application.class, args);
	}

}
