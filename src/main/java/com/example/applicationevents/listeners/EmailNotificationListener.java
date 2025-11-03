package com.example.applicationevents.listeners;

import com.example.applicationevents.model.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EmailNotificationListener {

    @EventListener
    @Async
    public void createOrderListener(OrderCreatedEvent orderCreatedEvent) throws InterruptedException {
        log.info("Sending Email notification for orderId: {}", orderCreatedEvent.getOrderId());
        Thread.sleep(3000);
        log.info("Sent Email notification for orderId: {}", orderCreatedEvent.getOrderId());
    }
}
