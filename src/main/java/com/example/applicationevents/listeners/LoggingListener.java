package com.example.applicationevents.listeners;

import com.example.applicationevents.model.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoggingListener {

    @EventListener
    public void createOrderEvent(OrderCreatedEvent orderCreatedEvent) {
        log.info("Logged Create Order event with orderId: {}", orderCreatedEvent.getOrderId());
    }
}
