package com.kathalia.emarket.order.services;

import com.kathalia.emarket.order.dto.OrderRequest;
import com.kathalia.emarket.order.model.Order;
import com.kathalia.emarket.order.repository.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;

    public void placeOrder(OrderRequest orderRequest){
        Order order =new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setSkuCode(orderRequest.skuCode());
        order.setPrice(orderRequest.price());
        order.setQuantity(orderRequest.quantity());
        repository.save(order);
    }
}
