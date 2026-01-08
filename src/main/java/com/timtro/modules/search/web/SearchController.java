package com.timtro.modules.search.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.search.dto.*;
import com.timtro.modules.search.service.RoomSearchService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Room Search operations.
 * 
 * Public APIs:
 * 1. GET /v1/search - Tìm kiếm phòng
 * 2. GET /v1/search/nearby - Tìm gần vị trí
 * 3. GET /v1/search/near-university/{id} - Tìm gần trường
 * 4. GET /v1/search/autocomplete - Autocomplete
 * 5. GET /v1/search/similar/{roomId} - Phòng tương tự
 * 6. GET /v1/search/popular - Phòng phổ biến
 * 7. GET /v1/search/recent - Phòng mới đăng
 */
@RestController
@RequestMapping("/v1/search")
@RequiredArgsConstructor
@Tag(name = "Search", description = "Room search APIs powered by Elasticsearch")
public class SearchController {

    private final RoomSearchService roomSearchService;

    @GetMapping
    @Operation(summary = "Search rooms with multiple filters")
    public ResponseEntity<ApiResponse<SearchResponse>> search(RoomSearchRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/nearby")
    @Operation(summary = "Search rooms near a location")
    public ResponseEntity<ApiResponse<SearchResponse>> searchNearby(
            @RequestParam Double latitude,
            @RequestParam Double longitude,
            @RequestParam(defaultValue = "3") Double radiusKm,
            RoomSearchRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/near-university/{universityId}")
    @Operation(summary = "Search rooms near a university")
    public ResponseEntity<ApiResponse<SearchResponse>> searchNearUniversity(
            @PathVariable Long universityId,
            @RequestParam(defaultValue = "3") Double radiusKm,
            RoomSearchRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/autocomplete")
    @Operation(summary = "Autocomplete suggestions for search")
    public ResponseEntity<ApiResponse<AutocompleteResponse>> autocomplete(
            @RequestParam String query,
            @RequestParam(defaultValue = "10") Integer limit) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/similar/{roomId}")
    @Operation(summary = "Find similar rooms")
    public ResponseEntity<ApiResponse<SearchResponse>> findSimilar(
            @PathVariable Long roomId,
            @RequestParam(defaultValue = "6") Integer limit) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/popular")
    @Operation(summary = "Get popular/trending rooms")
    public ResponseEntity<ApiResponse<SearchResponse>> getPopularRooms(
            @RequestParam(required = false) Integer districtId,
            @RequestParam(defaultValue = "12") Integer limit) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/recent")
    @Operation(summary = "Get recently listed rooms")
    public ResponseEntity<ApiResponse<SearchResponse>> getRecentRooms(
            @RequestParam(required = false) Integer districtId,
            @RequestParam(defaultValue = "12") Integer limit) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
