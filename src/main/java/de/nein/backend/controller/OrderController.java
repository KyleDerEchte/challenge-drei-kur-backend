package de.nein.backend.controller;

import de.nein.backend.entity.Order;
import de.nein.backend.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/store/order")
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getOrders() {
        return new ResponseEntity<>(orderService.getOrders(), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<List<Order>> getProductsForUser(@RequestParam long id) {
        return new ResponseEntity<>(orderService.getOrderByCustomerId(id), HttpStatus.OK);
    }

    @PostMapping("/new")
    public String createOrder(@RequestBody Order order){

        orderService.saveOrder(order);
        return "Order created.";
    }
}


