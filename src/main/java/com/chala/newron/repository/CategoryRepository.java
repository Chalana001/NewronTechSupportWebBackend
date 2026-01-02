package com.chala.newron.repository;

import com.chala.newron.model.entity.CategoryEntity;
import com.chala.newron.model.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
