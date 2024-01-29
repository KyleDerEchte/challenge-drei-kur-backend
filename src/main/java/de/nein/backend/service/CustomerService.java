package de.nein.backend.service;

import de.nein.backend.entity.Customer;
import de.nein.backend.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Optional<Customer> getCustomerById(long id) {
        final Customer customer = this.customerRepository.findCustomersById(id);
        if (customer == null) {
            return Optional.empty();
        }
        //return Optional.of(customer); due to no login the frontend cannot deliver a customerId
        return Optional.empty();
    }


    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }
}
