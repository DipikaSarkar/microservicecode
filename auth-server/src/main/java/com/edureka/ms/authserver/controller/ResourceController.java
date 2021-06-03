package com.edureka.ms.authserver.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

	
	@GetMapping("/some-resource")
	public String getSomeResource() {
		return "HelloWorld";
	}
	
	
	@GetMapping("/user/me")
    public Principal user(Principal principal) {
        return principal;
    }
}
