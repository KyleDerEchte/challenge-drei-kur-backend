package de.nein.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Long id;
    private CustomerDTO customer;
    private List<OrderDetailDTO> orderDetails;
    private LocalDateTime localDateTime;
    private PaymentMethodDTO paymentMethod;
    private OrderFulfillmentDTO orderFulfillment;
}
