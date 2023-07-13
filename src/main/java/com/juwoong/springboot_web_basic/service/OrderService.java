package com.juwoong.springboot_web_basic.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.juwoong.springboot_web_basic.model.Email;
import com.juwoong.springboot_web_basic.model.Order;
import com.juwoong.springboot_web_basic.model.OrderItem;
import com.juwoong.springboot_web_basic.model.OrderStatus;
import com.juwoong.springboot_web_basic.repository.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    public Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems) {
        Order order = new Order(
            UUID.randomUUID(),
            email,
            address,
            postcode,
            orderItems,
            OrderStatus.ACCEPTED,
            LocalDateTime.now(),
            LocalDateTime.now());
        return orderRepository.insert(order);
    }

}
