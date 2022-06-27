package com.charoldev.productmicroservice.controller;

import com.charoldev.productmicroservice.entity.ProductEntity;
import com.charoldev.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
//import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    /*  @GetMapping
    public ResponseEntity<List<ProductEntity>> getAllProductsDeprecated(){
        List<ProductEntity> productEntityList = productRepository.findAll();
        ResponseEntity<List<ProductEntity>> responseEntity = new ResponseEntity<>(productEntityList,HttpStatus.OK);
        return responseEntity;
    }   */

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductEntity product) {
        productRepository.save(product);
    }

}
