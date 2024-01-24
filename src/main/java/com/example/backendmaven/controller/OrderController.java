package com.example.backendmaven.controller;

import com.example.backendmaven.entity.Order;
import com.example.backendmaven.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/store/order")
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getOrders(){
        return new ResponseEntity<>(orderService.getOrders(), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<List<Order>> getProductsForUser(@RequestParam long id){
        return new ResponseEntity<>(orderService.getOrderByCustomerId(id),HttpStatus.OK);
    }

}
