package com.example.applicationevents.listeners;

import com.example.applicationevents.model.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmailNotificationListener {

    @EventListener
    public void createOrderListener(OrderCreatedEvent orderCreatedEvent) {
        log.info("Sent Email notification for orderId: {}", orderCreatedEvent.getOrderId());
    }
}
