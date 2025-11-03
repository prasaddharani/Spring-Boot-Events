package com.example.applicationevents.controller;

import com.example.applicationevents.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("{orderId}")
    public String createOrder(@PathVariable String orderId, @RequestParam double amount) {
        return orderService.createOrder(orderId, amount);
    }
}
