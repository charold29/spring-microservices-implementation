package com.charoldev.productmicroservice.repository;

import com.charoldev.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
