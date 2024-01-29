package de.nein.backend.service;

import de.nein.backend.dto.OrderDetailDTO;
import de.nein.backend.entity.OrderDetail;
import de.nein.backend.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class OrderDetailService {
    private final ProductService productService;

    public OrderDetail convertToEntity(OrderDetailDTO orderDetailDTO) {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(orderDetailDTO.getId());
        orderDetail.setAmount(orderDetailDTO.getAmount());
        if (orderDetailDTO.getProduct() != null) {
            Product product = productService.convertToEntity(orderDetailDTO.getProduct());
            orderDetail.setProduct(product);
        }
        // Setze 'order' falls notwendig
        return orderDetail;
    }

}
