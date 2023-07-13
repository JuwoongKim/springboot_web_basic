package com.juwoong.springboot_web_basic.controller;

import com.juwoong.springboot_web_basic.model.Category;

public record CreateProductRequest(String productName, Category category, long price, String description) {
}
