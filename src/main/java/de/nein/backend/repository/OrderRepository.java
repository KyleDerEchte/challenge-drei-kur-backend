package de.nein.backend.repository;

import de.nein.backend.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findAll();

    List<Order> findOrdersByCustomer_Id(long id);



}
