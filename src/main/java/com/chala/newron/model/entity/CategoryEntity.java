package com.chala.newron.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Category")
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public CategoryEntity() {

    }

    public String getName() {
        return name;
    }

    public CategoryEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
