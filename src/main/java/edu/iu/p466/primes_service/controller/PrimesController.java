package edu.iu.p466.prime_service.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.iu.p466.prime_service.service.IPrimesService;

@RestController
@CrossOrigin

@RequestMapping("/request")
public class PrimesController {

    IPrimesService primesService;

    public PrimesController(IPrimesService primesService){
        this.primesService = primesService;
    }

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable int n) {
        return primesService.isPrime(n);
    }
    
}
