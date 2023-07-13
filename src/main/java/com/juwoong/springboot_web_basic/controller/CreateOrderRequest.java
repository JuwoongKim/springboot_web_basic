package com.juwoong.springboot_web_basic.controller;

import java.util.List;

import com.juwoong.springboot_web_basic.model.OrderItem;

public record CreateOrderRequest(
  String email, String address, String postcode, List<OrderItem> orderItems
) {
}