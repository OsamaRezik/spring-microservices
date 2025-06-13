package com.kathalia.emarket.inventory.repository;

import com.kathalia.emarket.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    boolean existsBySkuCodeAndQuantityGreaterThanEqual(String squCode, Integer quantity);
}
