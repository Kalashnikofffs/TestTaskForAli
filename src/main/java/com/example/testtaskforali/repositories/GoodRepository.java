package com.example.testtaskforali.repositories;


import com.example.testtaskforali.models.Good;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component // Temporary
public class GoodRepository {

    List<Good> mockdbGoods = new ArrayList<>();


    public Good createGood(String name, Double price) {
        Good good = new Good(name, price);
        mockdbGoods.add(good);
        mockdbGoods.forEach(g -> System.out.println(g.getName()));
        return good;

    }
}
