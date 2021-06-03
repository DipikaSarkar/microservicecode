package com.edureka.ms.authserver2.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.edureka.ms.authserver2.dbmodel.UserEntity;
import com.edureka.ms.authserver2.repository.UserEntityRepository;

@Component
public class UserEntityRunner implements CommandLineRunner {
	
	@Autowired
	private UserEntityRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(UserEntity.builder().userid("dipika").userpwd("{noop}dipika").build());
	}

}
