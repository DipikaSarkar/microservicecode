package com.edureka.oauth2server;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

	public UserEntity findByUserid(String username);

}
