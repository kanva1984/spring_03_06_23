package com.example.spring_03_06_23.service.impl;

import com.example.spring_03_06_23.service.StoreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Set<Integer> add(List<Integer> product) {
        return basket.add(product);
    }

    @Override
    public Set<Integer> get() {
        return basket.get();
    }
}
