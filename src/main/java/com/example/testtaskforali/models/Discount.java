package com.example.testtaskforali.models;

import lombok.Data;

import java.util.List;

@Data
public class Discount {

    private List<Good> goods;
    private int volume;
    private Integer daysOfDuration;





}
