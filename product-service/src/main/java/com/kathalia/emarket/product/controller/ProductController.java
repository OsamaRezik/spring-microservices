package com.kathalia.emarket.product.controller;

import com.kathalia.emarket.product.dto.ProductRequest;
import com.kathalia.emarket.product.dto.ProductResponse;
import com.kathalia.emarket.product.model.Product;
import com.kathalia.emarket.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest product){
       return service.createProduct(product);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse>getAllProducts(){
        return service.getAllProducts();
    }

}
