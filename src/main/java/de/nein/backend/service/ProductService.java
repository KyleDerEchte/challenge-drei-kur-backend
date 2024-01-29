package de.nein.backend.service;

import de.nein.backend.dto.ProductDTO;
import de.nein.backend.entity.MaterialColor;
import de.nein.backend.entity.Product;
import de.nein.backend.entity.ProductType;
import de.nein.backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductTypeService productTypeService;
    private final MaterialColorService materialColorService;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product convertToEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setSize(productDTO.getSize());
        product.setCosts(productDTO.getCosts());
        product.setPrice(productDTO.getPrice());
        if (productDTO.getProductType() != null) {
            ProductType productType = productTypeService.convertToEntity(productDTO.getProductType());
            product.setProductType(productType);
        }
        if (productDTO.getColor() != null) {
            MaterialColor color = materialColorService.convertToEntity(productDTO.getColor());
            product.setColor(color);
        }
        // Behandle materialType Liste
        return product;
    }


    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
