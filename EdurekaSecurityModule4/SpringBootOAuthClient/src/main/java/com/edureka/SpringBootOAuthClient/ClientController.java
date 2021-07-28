package com.edureka.SpringBootOAuthClient;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @RequestMapping("/welcome")
    public Principal securedPage(Principal user) {
        return user;
    }
}
