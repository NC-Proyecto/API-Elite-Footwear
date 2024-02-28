package com.api.project.controller;

import com.api.project.model.Category;
import com.api.project.model.Product;
import com.api.project.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<Category>> getCategories() {
        try {
            List<Category> categories = categoryService.getCategories();
            return ResponseEntity.ok(categories);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.emptyList());
        }
    }
    @PostMapping
    public ResponseEntity<String> postCategory(@RequestBody Category category) {

        try {
            categoryService.saveCategory(category);
            return ResponseEntity.ok("Categoria creada exitosamente");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al crear la categoria: " + e.getMessage());
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable Long id) {
        try {
            categoryService.deleteCategory(id);
            return ResponseEntity.ok("Categoria eliminada exitosamente");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al eliminar la categoria: " + e.getMessage());
        }
    }
    @PutMapping
    public ResponseEntity<Category> editCategory(@RequestBody Category category) {
        try {
            categoryService.editCategory(category);
            Category editedCategory = categoryService.findCategory(category.getId());
            return ResponseEntity.ok(editedCategory);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }
}
