package com.juwoong.springboot_web_basic.controller.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.juwoong.springboot_web_basic.controller.CreateOrderRequest;
import com.juwoong.springboot_web_basic.model.Email;
import com.juwoong.springboot_web_basic.model.Order;
import com.juwoong.springboot_web_basic.service.OrderService;

@RestController
public class OrderRestController {

    private final OrderService orderService;

    public OrderRestController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/api/v1/orders")
    public Order createOrder(@RequestBody CreateOrderRequest orderRequest) {
        return orderService.createOrder(
            new Email(orderRequest.email()),
            orderRequest.address(),
            orderRequest.postcode(),
            orderRequest.orderItems()
        );
    }
}
