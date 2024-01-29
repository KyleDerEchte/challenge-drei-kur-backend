package de.nein.backend.service;

import de.nein.backend.dto.OrderDTO;
import de.nein.backend.entity.*;
import de.nein.backend.repository.OrderRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerService customerService;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }


    public List<Order> getOrderByCustomerId(long id){
        return orderRepository.findOrdersByCustomer_Id(id);
    }

    public Order saveOrder(OrderDTO orderDTO){
        Customer customer;
        Optional<Customer> optionalCustomer = customerService.getCustomerById(orderDTO.getCustomer().getId());
        customer = optionalCustomer.orElseGet(() -> new Customer(0L,
                orderDTO.getCustomer().getForename(),
                orderDTO.getCustomer().getSurname(),
                new Address(
                        orderDTO.getCustomer().getId(),
                        orderDTO.getCustomer().getStreet(),
                        orderDTO.getCustomer().getHouseNumber(),
                        orderDTO.getCustomer().getPlz(),
                        orderDTO.getCustomer().getCity(),
                        orderDTO.getCustomer().getCountry()
                )
        ));
        Order order = new Order(
                0L,
                orderDTO.getOrderDetails(),
                customer,
                LocalDateTime.now(),
                new OrderFulfillment(0L,"order-placed"),
                orderDTO.getPaymentMethod()
        );
        return this.orderRepository.save(order);
    }
}
