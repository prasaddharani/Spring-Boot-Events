package com.example.applicationevents.service;

import com.example.applicationevents.model.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    private final ApplicationEventPublisher publisher;

    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }


    public String createOrder(String orderId, double amount) {
        log.info("Created order with orderId: {}", orderId);
        publisher.publishEvent(new OrderCreatedEvent(orderId, amount));
        return "Created order with orderId: " + orderId;
    }
}
