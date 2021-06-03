package com.edureka.ms.authserver2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edureka.ms.authserver2.dbmodel.UserEntity;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

	public UserEntity findByUserid(String username);

}
