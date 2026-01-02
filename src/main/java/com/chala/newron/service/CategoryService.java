package com.chala.newron.service;

import com.chala.newron.model.dto.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);

    List<String> getCategoryList();
}
