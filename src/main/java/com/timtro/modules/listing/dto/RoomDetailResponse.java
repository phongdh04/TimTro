package com.timtro.modules.listing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Response DTO for room details.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetailResponse {

    private Long id;
    private String title;
    private String slug;
    private BigDecimal price;
    private BigDecimal area;

    private String category;
    private String genderRestriction;
    private String status;

    private String thumbnailUrl;
    private String videoUrl;
    private List<String> imageUrls;

    // House Info
    private Long houseId;
    private String houseName;
    private String address;
    private String districtName;

    // Landlord Info
    private Long landlordId;
    private String landlordName;
    private String landlordPhone;
    private String landlordAvatar;

    // Stats
    private Integer viewCount;
    private Integer saveCount;
    private Double avgRating;
    private Integer totalReviews;

    // Timestamps
    private LocalDateTime createdAt;
    private LocalDateTime lastPushedAt;
}
