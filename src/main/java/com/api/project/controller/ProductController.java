package com.api.project.controller;

import com.api.project.model.Product;
import com.api.project.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {
        try {
            List<Product> vacancies = productService.getProducts();
            return ResponseEntity.ok(vacancies);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(Collections.emptyList());
        }
    }
@PostMapping
    public ResponseEntity<String> postProduct(@RequestBody Product product) {

    try {
        productService.saveProduct(product);
        return ResponseEntity.ok("Vacante creada exitosamente");
    } catch (Exception e) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error al crear la vacante: " + e.getMessage());
    }
}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        try {
            productService.deleteProduct(id);
            return ResponseEntity.ok("Vacante eliminada exitosamente");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al eliminar la vacante: " + e.getMessage());
        }
    }
    @PutMapping
    public ResponseEntity<Product> editVacancy(@RequestBody Product product) {
        try {
            productService.editProduct(product);
            Product vacanteEditada = productService.findProduct(product.getId());
            return ResponseEntity.ok(vacanteEditada);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

}
