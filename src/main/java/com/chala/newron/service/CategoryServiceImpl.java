package com.chala.newron.service;

import com.chala.newron.model.dto.Category;
import com.chala.newron.model.entity.CategoryEntity;
import com.chala.newron.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private List<CategoryEntity> categoryEntityListList = new ArrayList<>();
    private List<String> categoryList = new ArrayList<>();

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setName(category.getName());
        categoryRepository.save(categoryEntity);
        return category;
    }

    @Override
    public List<String> getCategoryList() {
        categoryList.clear();
        categoryEntityListList = categoryRepository.findAll();
        for (CategoryEntity categoryEntity: categoryEntityListList){
            categoryList.add(categoryEntity.getName());
        }
        return categoryList;
    }
}
