package com.api.project.service;

import com.api.project.model.Category;
import com.api.project.model.Product;
import com.api.project.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryService implements ICategoryService {
    @Autowired
    ICategoryRepository categoryRepository;
    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategory(Long id) {
        Optional<Category> optionalProduct = categoryRepository.findById(id);
        return optionalProduct.orElse(null);
    }

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public void editCategory(Category category) {
        saveCategory(category);

    }
}
