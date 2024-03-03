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
            List<Product> products = productService.getProducts();
            return ResponseEntity.ok(products);
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
        return ResponseEntity.ok("Producto creado exitosamente");
    } catch (Exception e) {
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error al crear el producto: " + e.getMessage());
    }
}
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        try {
            productService.deleteProduct(id);
            return ResponseEntity.ok("Producto eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error al eliminar el producto: " + e.getMessage());
        }
    }
    @PutMapping
    public ResponseEntity<Product> editVacancy(@RequestBody Product product) {
        try {
            productService.editProduct(product);
            Product editedProduct = productService.findProduct(product.getId());
            return ResponseEntity.ok(editedProduct);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

}
