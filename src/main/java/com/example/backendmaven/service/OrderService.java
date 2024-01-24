package com.example.backendmaven.service;

import com.example.backendmaven.entity.Order;
import com.example.backendmaven.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderService {
    private final OrderRepository orderRepository;

    public List<Order> getOrders(){
        return orderRepository.findAll();
    }


    public List<Order> getOrderByCustomerId(long id){
        return orderRepository.findOrdersByCustomer_Id(id);
    }
}
