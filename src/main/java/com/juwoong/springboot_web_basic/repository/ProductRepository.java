package com.juwoong.springboot_web_basic.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.juwoong.springboot_web_basic.model.Category;
import com.juwoong.springboot_web_basic.model.Product;

public interface ProductRepository {

    List<Product> findAll();

    Product insert(Product product);

    Product update(Product product);

    Optional<Product> findById(UUID productId);

    Optional<Product> findByName(String productName);

    List<Product> findByCategory(Category category);

    void deleteAll();
}
