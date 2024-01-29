package de.nein.backend.service;

import de.nein.backend.dto.OrderFulfillmentDTO;
import de.nein.backend.entity.OrderFulfillment;
import org.springframework.stereotype.Service;

@Service
public class OrderFulfillmentService {

    public OrderFulfillment convertToEntity(OrderFulfillmentDTO orderFulfillmentDTO) {
        OrderFulfillment orderFulfillment = new OrderFulfillment();
        orderFulfillment.setId(orderFulfillmentDTO.getId());
        orderFulfillment.setDescription(orderFulfillmentDTO.getDescription());
        return orderFulfillment;
    }

}
