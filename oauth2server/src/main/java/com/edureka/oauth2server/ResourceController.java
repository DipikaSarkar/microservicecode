package com.edureka.oauth2server;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@GetMapping("/user/me")
    public Principal getUser(Principal principal) {
        return principal;
    }
}
