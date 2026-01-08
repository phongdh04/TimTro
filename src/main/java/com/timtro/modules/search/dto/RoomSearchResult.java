package com.timtro.modules.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO response cho kết quả tìm kiếm phòng.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomSearchResult {

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
    private Double latitude;
    private Double longitude;

    // Distance (nếu tìm theo geo)
    private Double distanceKm;

    // Stats
    private Integer viewCount;
    private Integer saveCount;
    private Double avgRating;

    // Ranking
    private Integer priorityLevel;
    private LocalDateTime lastPushedAt;

    // Relevance score (from Elasticsearch)
    private Float score;

    // Highlights (matched terms)
    private String titleHighlight;
    private String addressHighlight;

    private LocalDateTime createdAt;
}
