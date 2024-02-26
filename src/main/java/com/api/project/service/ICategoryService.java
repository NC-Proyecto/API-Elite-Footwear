package com.api.project.service;

import com.api.project.model.Category;
import com.api.project.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryService  {
    public List<Category> getCategories();
    public Category findCategory(Long id);

    public void saveCategory(Category category);

    public void deleteCategory(Long id);

    public void editCategory(Category category);
}
