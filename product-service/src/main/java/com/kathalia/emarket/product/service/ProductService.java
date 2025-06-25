package com.kathalia.emarket.product.service;

import com.kathalia.emarket.product.dto.ProductRequest;
import com.kathalia.emarket.product.dto.ProductResponse;
import com.kathalia.emarket.product.model.Product;
import com.kathalia.emarket.product.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductResponse createProduct(ProductRequest request){
       Product product= Product.builder()
                .name(request.name())
                .id(request.id())
                .description(request.description())
                .price(request.price())
                .build();
        repository.save(product);
        log.info("product created");
        return new ProductResponse(product.getId(),product.getName(),product.getDescription(),product.getPrice());
    }

    public List<ProductResponse> getAllProducts() {
        log.info("a get all request came");
        return repository.findAll()
                .stream().map(p->new ProductResponse(p.getId(),p.getName(),p.getDescription(),p.getPrice()))
                .toList();
    }
}
