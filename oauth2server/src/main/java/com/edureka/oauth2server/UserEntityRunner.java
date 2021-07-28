package com.edureka.oauth2server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserEntityRunner implements CommandLineRunner {
	
	@Autowired
	private UserEntityRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(UserEntity.builder().userid("dipika").userpwd("{noop}dipika").build());
		repository.save(UserEntity.builder().userid("partha").userpwd("{noop}google").build());
	}

}
