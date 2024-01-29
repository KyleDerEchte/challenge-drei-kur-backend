package de.nein.backend.service;

import de.nein.backend.dto.PaymentMethodDTO;
import de.nein.backend.entity.PaymentMethod;
import org.springframework.stereotype.Service;

@Service
public class PaymentMethodService {

    public PaymentMethod convertToEntity(PaymentMethodDTO paymentMethodDTO) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setId(paymentMethodDTO.getId());
        paymentMethod.setDescription(paymentMethodDTO.getDescription());
        return paymentMethod;
    }

}
