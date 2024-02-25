package com.api.project.service;

import com.api.project.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getProducts();
    public Product findProduct(Long id);

    public void saveProduct(Product product);

    public void deleteProduct(Long id);

    public void editProduct(Product product);
}
