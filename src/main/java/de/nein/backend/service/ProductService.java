package de.nein.backend.service;

import de.nein.backend.entity.Product;
import de.nein.backend.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product saveProduct(Product product){

        return productRepository.save(product);
    }
}
