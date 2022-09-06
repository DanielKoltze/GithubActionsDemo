package Daniel.repositories;

import Daniel.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    @Override
    Optional<Customer> findById(Integer integer);
}
