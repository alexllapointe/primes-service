package edu.iu.p466.prime_service.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PrimesServiceTest {

    PrimesService primesService = new PrimesService();
    @Test
    void testIsPrime() {

    }


    @Test
    void _285191IsPrime() {
        long n = 285191;
        boolean expected = true;
        boolean actual = primesService.isPrime(n);
        assertEquals(expected, actual);
    }

    @Test
    void _45IsNotPrime() {
        
        int n = 45;
        boolean expected = false;
        boolean actual = primesService.isPrime(n);

        assertEquals(expected, actual);
    }
}
