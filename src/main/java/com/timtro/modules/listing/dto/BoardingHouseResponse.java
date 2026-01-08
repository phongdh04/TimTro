package com.timtro.modules.listing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Response DTO cho chi tiết BoardingHouse.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardingHouseResponse {

    private Long id;
    private String name;
    private String addressDetail;

    // Location
    private Integer districtId;
    private String districtName;
    private Double latitude;
    private Double longitude;

    // Smart features
    private String nearbyBusRoutes;
    private Integer distanceToBusStop;

    // Services & Amenities
    private String serviceCosts;
    private String amenities;

    // Trust factors
    private Boolean isVerified;
    private BigDecimal avgRating;
    private Integer totalReviews;

    // Landlord info
    private Long landlordId;
    private String landlordName;

    // Rooms in this house
    private Integer totalRooms;
    private Integer availableRooms;

    private LocalDateTime createdAt;
}
