package com.example.spring_03_06_23.service;


import java.util.List;
import java.util.Set;

public interface StoreService {

    Set<Integer> add(List<Integer> product);

    Set<Integer> get();


}
