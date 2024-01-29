package de.nein.backend.service;

import de.nein.backend.dto.OrderDTO;
import de.nein.backend.dto.OrderFulfillmentDTO;
import de.nein.backend.entity.Customer;
import de.nein.backend.entity.Order;
import de.nein.backend.entity.OrderDetail;
import de.nein.backend.entity.PaymentMethod;
import de.nein.backend.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderService {
    private final OrderRepository orderRepository;
    private final CustomerService customerService;
    private final OrderDetailService orderDetailService;
    private final PaymentMethodService paymentMethodService;
    private final OrderFulfillmentService orderFulfillmentService;

    public Order saveOrder(OrderDTO orderDTO) {
        Order entity = convertToEntity(orderDTO);
        this.orderRepository.save(entity);
        entity.getOrderDetails().forEach(orderDetail -> orderDetail.getProduct().setCosts(0d));
        return entity;
    }

    public Order convertToEntity(OrderDTO orderDTO) {
        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setOrderDate(orderDTO.getLocalDateTime());
        if (orderDTO.getCustomer() != null) {
            Customer customer = customerService.convertToEntity(orderDTO.getCustomer());
            order.setCustomer(customer);
        }
        if (orderDTO.getOrderDetails() != null) {
            List<OrderDetail> orderDetails = orderDTO.getOrderDetails().stream()
                    .map(orderDetailService::convertToEntity)
                    .collect(Collectors.toList());
            order.setOrderDetails(orderDetails);
        }
        if (orderDTO.getPaymentMethod() != null) {
            PaymentMethod paymentMethod = paymentMethodService.convertToEntity(orderDTO.getPaymentMethod());
            order.setPaymentMethod(paymentMethod);
        }
        order.setOrderFulfillment(orderFulfillmentService.convertToEntity(orderDTO.getOrderFulfillment()));
        return order;
    }
}
