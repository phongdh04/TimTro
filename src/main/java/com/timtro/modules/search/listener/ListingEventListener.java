package com.timtro.modules.search.listener;

import com.timtro.modules.listing.event.ListingCreatedEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Listens to Listing events and syncs data to Elasticsearch.
 * This decouples the Search module from the Listing module (NO direct DB
 * access).
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ListingEventListener {

    // TODO: Inject ElasticsearchService when implemented
    // private final ElasticsearchService elasticsearchService;

    /**
     * Handle listing created event.
     * Sync the new listing to Elasticsearch for fast search.
     */
    @Async
    @EventListener
    public void handleListingCreated(ListingCreatedEvent event) {
        log.info("Received ListingCreatedEvent for roomId: {}", event.getRoomId());

        // TODO: Implement Elasticsearch indexing
        // RoomDocument document = RoomDocument.builder()
        // .id(event.getRoomId())
        // .title(event.getTitle())
        // .price(event.getPrice())
        // .districtId(event.getDistrictId())
        // .location(new GeoPoint(event.getLatitude(), event.getLongitude()))
        // .build();
        // elasticsearchService.indexRoom(document);

        log.info("Listing {} synced to Elasticsearch (placeholder)", event.getRoomId());
    }
}
