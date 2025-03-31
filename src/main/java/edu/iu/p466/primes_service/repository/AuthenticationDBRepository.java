package edu.iu.p466.primes_service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.iu.p466.primes_service.model.Customer;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {

    Customer findByUsername(String username);
}
