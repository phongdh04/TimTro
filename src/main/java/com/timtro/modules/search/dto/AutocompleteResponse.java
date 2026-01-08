package com.timtro.modules.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DTO response cho autocomplete/suggestions.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AutocompleteResponse {

    private List<Suggestion> suggestions;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Suggestion {
        private String type; // room, district, university, keyword
        private String text;
        private String slug;
        private Long id;
        private String thumbnail;
        private String subtitle; // Giá hoặc địa chỉ phụ
    }
}
