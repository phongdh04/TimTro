package com.timtro.modules.listing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * DTO chứa tiêu chí tìm kiếm phòng.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomSearchCriteria {

    // Price range
    private BigDecimal minPrice;
    private BigDecimal maxPrice;

    // Area range
    private BigDecimal minArea;
    private BigDecimal maxArea;

    // Location filters
    private Integer districtId;
    private Long universityId;
    private Double nearbyRadius; // km

    // Category filters
    private String category; // studio, khep_kin, chung_chu, nguyen_can
    private String genderRestriction; // all, male, female

    // Keyword search
    private String keyword;

    // Sorting
    private String sortBy; // price, area, createdAt, viewCount, lastPushedAt
    private String sortDirection; // asc, desc

    // Status filter
    private String status; // active, rented, expired

    // Landlord filter (for landlord dashboard)
    private Long landlordId;
}
