package com.example.applicationevents.listeners;

import com.example.applicationevents.model.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoggingListener {

    @EventListener
    @Order(1)
    @Async
    public void createOrderEvent(OrderCreatedEvent orderCreatedEvent) throws InterruptedException {
        log.info("Logging Create Order event with orderId: {}", orderCreatedEvent.getOrderId());
        Thread.sleep(1000);
        log.info("Logged Create Order event with orderId: {}", orderCreatedEvent.getOrderId());
    }
}
