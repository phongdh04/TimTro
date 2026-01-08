package com.timtro.core.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Base Event class for all domain events.
 * Events are used for inter-module communication (Event-Driven Architecture).
 */
@Getter
public abstract class DomainEvent extends ApplicationEvent {

    private final String eventType;
    private final Long aggregateId;

    protected DomainEvent(Object source, String eventType, Long aggregateId) {
        super(source);
        this.eventType = eventType;
        this.aggregateId = aggregateId;
    }
}
