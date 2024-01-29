package de.nein.backend.dto;

import de.nein.backend.entity.OrderDetail;
import de.nein.backend.entity.PaymentMethod;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderDTO {
    private Long id;
    private CustomerDTO customer;
    private List<OrderDetail> orderDetails;
    private LocalDateTime localDateTime;
    private PaymentMethod paymentMethod;
}
