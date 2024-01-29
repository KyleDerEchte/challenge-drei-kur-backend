package de.nein.backend.controller;

import de.nein.backend.entity.Product;
import de.nein.backend.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/store")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity<>(productService.getProducts(),HttpStatus.OK);
    }

    @PostMapping("/new")
    public String createProduct(@RequestBody Product product){

        productService.saveProduct(product);
        return "Product created.";
    }
}
