package com.example.testtaskforali.models;


import lombok.Data;

import java.util.List;

@Data
public class Good {

    public Good(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    private String name;
    private String desc;
//    private Organization org;
    private Double price;
    private List<Discount> discountList;
//    private List<Comments> comments;


}
