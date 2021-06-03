package com.edureka.ms.authserver2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.edureka.ms.authserver2.dbmodel.UserEntity;
import com.edureka.ms.authserver2.repository.UserEntityRepository;

@Service
public class CustomUserDetailService implements UserDetailsService {
	
	@Autowired
	private UserEntityRepository repository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = repository.findByUserid(username);
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		UserDetails user = new User(userEntity.getUserid(), userEntity.getUserpwd(), true, true,
				true, true, authorities);
		return user;
	}

}
