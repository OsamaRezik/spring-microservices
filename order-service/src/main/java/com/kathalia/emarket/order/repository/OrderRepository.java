package com.kathalia.emarket.order.repository;

import com.kathalia.emarket.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
