package com.example.spring_03_06_23.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class Basket {
    private final Set<Integer> goods = new HashSet<>();
    public Set<Integer> add(List<Integer> product){
        goods.addAll(product);
        return goods;
    }


    public Set<Integer> get(){
        return new HashSet<>(goods);

    }
}
