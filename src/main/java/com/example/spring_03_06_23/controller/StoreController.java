package com.example.spring_03_06_23.controller;


import com.example.spring_03_06_23.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public Set<Integer> add(@RequestParam List<Integer> product) {
        return storeService.add(product);
    }

    @GetMapping("get")
    public Set<Integer> get() {
        return storeService.get();
    }

}
