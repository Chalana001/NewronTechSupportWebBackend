package com.chala.newron.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Item {
    private Integer itemCode;
    private String name;
    private String description;
    private String category;
    private String brand;
    private double price;
    private String imgUrl;
}
