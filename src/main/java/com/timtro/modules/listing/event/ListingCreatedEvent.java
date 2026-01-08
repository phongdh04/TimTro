package com.timtro.modules.listing.event;

import com.timtro.core.event.DomainEvent;
import lombok.Getter;

/**
 * Event fired when a new listing (room) is created.
 * The Search module listens to this event to sync data to Elasticsearch.
 */
@Getter
public class ListingCreatedEvent extends DomainEvent {

    private final Long roomId;
    private final String title;
    private final Double price;
    private final Integer districtId;
    private final Double latitude;
    private final Double longitude;

    public ListingCreatedEvent(Object source, Long roomId, String title, Double price,
            Integer districtId, Double latitude, Double longitude) {
        super(source, "LISTING_CREATED", roomId);
        this.roomId = roomId;
        this.title = title;
        this.price = price;
        this.districtId = districtId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
