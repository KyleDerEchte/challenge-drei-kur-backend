package de.nein.backend.service;

import de.nein.backend.dto.CustomerDTO;
import de.nein.backend.entity.Address;
import de.nein.backend.entity.Customer;
import de.nein.backend.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final AddressService addressService;


    public Customer convertToEntity(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setForename(customerDTO.getForename());
        customer.setSurname(customerDTO.getSurname());
        if (customerDTO.getAddress() != null) {
            Address address = addressService.convertToEntity(customerDTO.getAddress());
            customer.setAddress(address);
        }
        return customer;
    }

    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }
}
