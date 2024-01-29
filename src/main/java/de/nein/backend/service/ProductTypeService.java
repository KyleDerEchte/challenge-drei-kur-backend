package de.nein.backend.service;

import de.nein.backend.dto.ProductTypeDTO;
import de.nein.backend.entity.ProductType;
import org.springframework.stereotype.Service;

@Service
public class ProductTypeService {

    public ProductType convertToEntity(ProductTypeDTO productTypeDTO) {
        ProductType productType = new ProductType();
        productType.setId(productTypeDTO.getId());
        productType.setName(productTypeDTO.getName());
        return productType;
    }

}
