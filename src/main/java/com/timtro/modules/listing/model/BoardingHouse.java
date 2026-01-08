package com.timtro.modules.listing.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "boarding_houses")
public class BoardingHouse extends BaseEntity {

    @Column(name = "landlord_id", nullable = false)
    private Long landlordId;

    @Column(name = "district_id", nullable = false)
    private Integer districtId;

    @Column(nullable = false)
    private String name;

    @Column(name = "address_detail", columnDefinition = "TEXT")
    private String addressDetail;

    @Column(name = "location_point", columnDefinition = "POINT SRID 4326")
    private Point locationPoint;

    // Smart features
    @Column(name = "nearby_bus_routes", columnDefinition = "JSON")
    private String nearbyBusRoutes;

    @Column(name = "distance_to_bus_stop")
    private Integer distanceToBusStop;

    // Service costs & amenities
    @Column(name = "service_costs", columnDefinition = "JSON")
    private String serviceCosts;

    @Column(columnDefinition = "JSON")
    private String amenities;

    // Trust factors
    @Column(name = "is_verified")
    private Boolean isVerified = false;

    @Column(name = "avg_rating", precision = 2, scale = 1)
    private BigDecimal avgRating = BigDecimal.ZERO;

    @Column(name = "total_reviews")
    private Integer totalReviews = 0;
}
