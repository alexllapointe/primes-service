package edu.iu.p466.primes_service.repository;

import java.io.IOException;

import edu.iu.p466.primes_service.model.Customer;

public interface IAuthenticationRepository{

    boolean save(Customer customer) throws IOException;
    Customer findByUsername(String username) throws IOException;
}