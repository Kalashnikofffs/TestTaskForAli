package com.example.testtaskforali.controller;

import com.example.testtaskforali.models.Good;
import com.example.testtaskforali.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api_v1")
public class MainController {
    @Autowired
    GoodService goodService;


    @PostMapping("/good")
    ResponseEntity<Good> createGood(@RequestParam String name,
                                    @RequestParam Double price) {

        Good good = goodService.createGood(name, price);
    return new ResponseEntity<>(good, HttpStatus.CREATED);
    }

}
