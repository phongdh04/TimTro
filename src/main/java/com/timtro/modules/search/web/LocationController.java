package com.timtro.modules.search.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.search.dto.*;
import com.timtro.modules.search.service.LocationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for Location (District, University) operations.
 * 
 * Public APIs:
 * 1. GET /v1/locations/districts - Danh sách quận/huyện
 * 2. GET /v1/locations/districts/{id} - Chi tiết quận
 * 3. GET /v1/locations/districts/slug/{slug} - Quận theo slug
 * 4. GET /v1/locations/universities - Danh sách trường
 * 5. GET /v1/locations/universities/{id} - Chi tiết trường
 * 6. GET /v1/locations/universities/slug/{slug} - Trường theo slug
 * 7. GET /v1/locations/universities/nearby - Trường gần vị trí
 */
@RestController
@RequestMapping("/v1/locations")
@RequiredArgsConstructor
@Tag(name = "Locations", description = "District and University APIs")
public class LocationController {

    private final LocationService locationService;

    // ========== Districts ==========

    @GetMapping("/districts")
    @Operation(summary = "Get all districts with room count")
    public ResponseEntity<ApiResponse<List<DistrictResponse>>> getAllDistricts() {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/districts/{id}")
    @Operation(summary = "Get district by ID")
    public ResponseEntity<ApiResponse<DistrictResponse>> getDistrictById(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/districts/slug/{slug}")
    @Operation(summary = "Get district by slug")
    public ResponseEntity<ApiResponse<DistrictResponse>> getDistrictBySlug(@PathVariable String slug) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // ========== Universities ==========

    @GetMapping("/universities")
    @Operation(summary = "Get all universities with nearby room count")
    public ResponseEntity<ApiResponse<List<UniversityResponse>>> getAllUniversities() {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/universities/{id}")
    @Operation(summary = "Get university by ID")
    public ResponseEntity<ApiResponse<UniversityResponse>> getUniversityById(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/universities/slug/{slug}")
    @Operation(summary = "Get university by slug")
    public ResponseEntity<ApiResponse<UniversityResponse>> getUniversityBySlug(@PathVariable String slug) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/universities/district/{districtId}")
    @Operation(summary = "Get universities in a district")
    public ResponseEntity<ApiResponse<List<UniversityResponse>>> getUniversitiesByDistrict(
            @PathVariable Long districtId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/universities/nearby")
    @Operation(summary = "Find universities near a location")
    public ResponseEntity<ApiResponse<List<UniversityResponse>>> findNearbyUniversities(
            @RequestParam Double latitude,
            @RequestParam Double longitude,
            @RequestParam(defaultValue = "5") Double radiusKm) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
