package com.kathalia.emarket.inventory.service;

import com.kathalia.emarket.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;
    public Boolean isInStock(String squCode,Integer quantity){
        return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(squCode,quantity);
    }
}
