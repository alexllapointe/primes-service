package edu.iu.p466.prime_service.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.p466.prime_service.model.Customer;
import edu.iu.p466.prime_service.service.IAuthenticationService;

@RestController
public class AuthenticationController {
    private final IAuthenticationService authenticationService;
    private final AuthenticationManager authenticationManager;
    

    public AuthenticationController(AuthenticationManager authenticationManager, IAuthenticationService authenticationService){
        this.authenticationService = authenticationService;
        this.authenticationManager = authenticationManager;
    }


    @PostMapping("/register")
    public boolean register(@RequestBody Customer customer){
        try {
            return authenticationService.register(customer);
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/login")
    public String login(@RequestBody Customer customer){
        Authentication authentication = authenticationManager.authenticate
            (new UsernamePasswordAuthenticationToken(customer.getUsername(), customer.getPassword()));
        return "success!";
    }


}
