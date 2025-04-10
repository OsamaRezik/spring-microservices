package com.kathalia.emarket.product.repository;

import com.kathalia.emarket.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
