package com.borealcoding.store.application.service;


import com.borealcoding.store.application.dto.CategoryDTO;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<CategoryDTO> getAllCategories();
    Optional<CategoryDTO> getCategoryById(Long categoryId);
    CategoryDTO saveCategory(CategoryDTO category);
    void deleteCategory(Long categoryId);
    List<CategoryDTO> getAllCategoriesByName(String partialName);
}
