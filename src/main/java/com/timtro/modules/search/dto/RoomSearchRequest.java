package com.timtro.modules.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * DTO cho tiêu chí tìm kiếm phòng với Elasticsearch.
 * Hỗ trợ full-text search, geo search, và nhiều bộ lọc.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomSearchRequest {

    // Full-text search
    private String keyword;

    // Price range
    private BigDecimal minPrice;
    private BigDecimal maxPrice;

    // Area range
    private BigDecimal minArea;
    private BigDecimal maxArea;

    // Location filters
    private Integer districtId;
    private String districtSlug;

    // Geo search - tìm theo tọa độ
    private Double latitude;
    private Double longitude;
    private Double radiusKm; // Bán kính tìm kiếm (km)

    // Tìm gần trường đại học
    private Long universityId;
    private Double universityRadiusKm;

    // Category filters
    private String category; // studio, khep_kin, chung_chu, nguyen_can
    private String genderRestriction; // all, male, female

    // Amenity filters (elasticsearch nested)
    private java.util.List<String> amenities; // wifi, dieu_hoa, may_giat, etc.

    // Price range presets
    private String priceRange; // duoi_2tr, tu_2_3tr, tu_3_5tr, tren_5tr

    // Status filter
    private String status; // active only by default

    // Sorting
    private String sortBy; // relevance, price_asc, price_desc, newest, nearest, popular

    // Pagination
    private Integer page;
    private Integer size;
}
