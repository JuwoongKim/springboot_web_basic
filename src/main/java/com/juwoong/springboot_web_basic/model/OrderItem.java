package com.juwoong.springboot_web_basic.model;

import java.util.UUID;

public record OrderItem(UUID productId, Category category, long price, int quantity) {
}