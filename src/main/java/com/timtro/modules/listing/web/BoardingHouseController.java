package com.timtro.modules.listing.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.listing.dto.*;
import com.timtro.modules.listing.service.BoardingHouseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for BoardingHouse management.
 * 
 * Landlord APIs:
 * 1. POST /v1/boarding-houses - Tạo nhà trọ
 * 2. GET /v1/boarding-houses/{id} - Chi tiết nhà trọ
 * 3. PUT /v1/boarding-houses/{id} - Cập nhật nhà trọ
 * 4. DELETE /v1/boarding-houses/{id} - Xóa nhà trọ
 * 5. GET /v1/boarding-houses/my-houses - Danh sách nhà trọ của tôi
 * 
 * Admin APIs:
 * 6. PUT /v1/boarding-houses/{id}/verify - Xác minh nhà trọ
 */
@RestController
@RequestMapping("/v1/boarding-houses")
@RequiredArgsConstructor
@Tag(name = "Boarding Houses", description = "Boarding house management APIs")
public class BoardingHouseController {

    private final BoardingHouseService boardingHouseService;

    @PostMapping
    @Operation(summary = "Create a new boarding house")
    public ResponseEntity<ApiResponse<BoardingHouseResponse>> createBoardingHouse(
            @Valid @RequestBody CreateBoardingHouseRequest request) {
        // TODO: Implement - Get landlordId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get boarding house details")
    public ResponseEntity<ApiResponse<BoardingHouseResponse>> getBoardingHouseById(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update boarding house")
    public ResponseEntity<ApiResponse<BoardingHouseResponse>> updateBoardingHouse(
            @PathVariable Long id,
            @Valid @RequestBody CreateBoardingHouseRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete boarding house")
    public ResponseEntity<ApiResponse<Void>> deleteBoardingHouse(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/my-houses")
    @Operation(summary = "Get all boarding houses owned by current landlord")
    public ResponseEntity<ApiResponse<Page<BoardingHouseResponse>>> getMyBoardingHouses(
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement - Get landlordId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // ========== Admin APIs ==========

    @PutMapping("/{id}/verify")
    @Operation(summary = "Verify boarding house (Admin only)")
    public ResponseEntity<ApiResponse<Void>> verifyBoardingHouse(
            @PathVariable Long id,
            @RequestParam boolean verified) {
        // TODO: Implement - Check admin role
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
