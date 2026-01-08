package com.timtro.modules.listing.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Response DTO cho danh sách Room (hiển thị trong list, không cần full detail).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomListResponse {

    private Long id;
    private String title;
    private String slug;
    private BigDecimal price;
    private BigDecimal area;
    private String category;
    private String thumbnailUrl;
    private String status;

    // Location
    private String districtName;
    private String address;

    // Stats
    private Integer viewCount;
    private Integer saveCount;
    private Double avgRating;

    // Package info
    private Integer priorityLevel;
    private LocalDateTime lastPushedAt;

    private LocalDateTime createdAt;
}
