package com.edureka.oauth2server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;


@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
	
	private final AuthenticationManager authenticationManager;
	
	
	private final PasswordEncoder passwordEncoder;

	
	@Autowired
	public AuthorizationServerConfig(AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder) {
		super();
		this.authenticationManager = authenticationManager;
		this.passwordEncoder = passwordEncoder;
	}
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		 clients.inMemory() 
		   .withClient("R2dpxQ3vPrtfgF72")
		   .secret(passwordEncoder.encode("fDw7Mpkk5czHNuSRtmhGmAGL42CaxQB9"))
		   .authorizedGrantTypes("authorization_code", "password", "refresh_token")
		   .scopes("read", "write", "user_info") 
		   .autoApprove(true)
		   .redirectUris("http://localhost:8082/login/oauth2/code/");
	}
	
	

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(authenticationManager);
	}
}
