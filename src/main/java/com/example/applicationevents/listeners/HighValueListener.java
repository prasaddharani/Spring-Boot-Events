package com.example.applicationevents.listeners;

import com.example.applicationevents.model.OrderCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HighValueListener {

    @EventListener(condition = "#orderCreatedEvent.amount > 1000")
    public void handleCreateOrderEvent(OrderCreatedEvent orderCreatedEvent) {
        log.info("High value order received with orderId: {} and amount: {}",
                orderCreatedEvent.getOrderId(), orderCreatedEvent.getAmount());
    }
}
