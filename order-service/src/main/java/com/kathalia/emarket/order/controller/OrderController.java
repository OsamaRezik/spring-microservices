package com.kathalia.emarket.order.controller;

import com.kathalia.emarket.order.dto.OrderRequest;
import com.kathalia.emarket.order.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest request){
        orderService.placeOrder(request);
        return "Order Placed Successfully";
    }
}
