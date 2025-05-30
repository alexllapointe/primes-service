package edu.iu.p466.primes_service.service;

import java.io.IOException;

import edu.iu.p466.primes_service.model.Customer;

public interface IAuthenticationService {
    Customer register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}
