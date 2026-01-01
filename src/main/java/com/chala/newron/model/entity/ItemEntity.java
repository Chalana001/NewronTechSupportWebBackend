package com.chala.newron.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Items")
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_code", nullable = false, unique = true)
    private Integer itemCode;
    private String name;
    private String description;
    private String category;
    private String brand;
    private double price;
    private String imgUrl;
}
