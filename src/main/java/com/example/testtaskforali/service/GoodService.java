package com.example.testtaskforali.service;


import com.example.testtaskforali.models.Good;
import com.example.testtaskforali.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodService {

    @Autowired
    GoodRepository goodRepository;
    public Good createGood(String name, Double price) {
        Good good = goodRepository.createGood(name, price);
        return good;
    }
}
