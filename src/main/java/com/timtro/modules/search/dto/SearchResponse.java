package com.timtro.modules.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * DTO response bao gồm kết quả search và aggregations.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchResponse {

    // Kết quả tìm kiếm
    private List<RoomSearchResult> results;

    // Pagination info
    private Long totalHits;
    private Integer page;
    private Integer size;
    private Integer totalPages;

    // Aggregations (facets) - để hiển thị bộ lọc
    private Map<String, List<FacetItem>> facets;

    // Price range stats
    private Double minPrice;
    private Double maxPrice;
    private Double avgPrice;

    // Query info
    private Long took; // Thời gian xử lý (ms)
    private String query; // Original query for debugging

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FacetItem {
        private String key;
        private String label;
        private Long count;
    }
}
