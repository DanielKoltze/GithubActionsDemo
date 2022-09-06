package Daniel.controllers;


import Daniel.model.Customer;
import Daniel.repositories.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    CustomerRepository customerRepository;

    CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findCustomerById(@PathVariable("id") int id){
        Optional<Customer> planet = Optional.of(customerRepository.findById(id).orElseThrow(() -> new RuntimeException("not found")));
        return ResponseEntity.ok().body(planet.get());
    }

}
