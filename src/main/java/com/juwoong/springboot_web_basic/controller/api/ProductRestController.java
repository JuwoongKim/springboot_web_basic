package com.juwoong.springboot_web_basic.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.juwoong.springboot_web_basic.model.Category;
import com.juwoong.springboot_web_basic.model.Product;
import com.juwoong.springboot_web_basic.service.ProductService;

@Controller
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/v1/products")
    public List<Product> productList(@RequestParam Optional<Category> category) {
        return category
            .map(productService::getProductsByCategory)
            .orElse(productService.getAllProducts());
    }
}
