package com.timtro.modules.payment.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.payment.dto.*;
import com.timtro.modules.payment.service.PackageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for Service Package operations.
 * 
 * Public APIs:
 * 1. GET /v1/packages - Danh sách gói dịch vụ
 * 2. GET /v1/packages/{id} - Chi tiết gói
 * 
 * Landlord APIs:
 * 3. POST /v1/packages/purchase - Mua gói
 * 4. GET /v1/packages/room/{roomId} - Gói active của phòng
 * 5. GET /v1/packages/room/{roomId}/history - Lịch sử mua gói
 * 6. GET /v1/packages/my-active - Tất cả gói đang active
 * 7. POST /v1/packages/room/{roomId}/renew - Gia hạn gói
 * 8. DELETE /v1/packages/room/{roomId} - Hủy gói
 */
@RestController
@RequestMapping("/v1/packages")
@RequiredArgsConstructor
@Tag(name = "Service Packages", description = "Service package management APIs")
public class PackageController {

    private final PackageService packageService;

    // ========== Public APIs ==========

    @GetMapping
    @Operation(summary = "Get all available service packages")
    public ResponseEntity<ApiResponse<List<ServicePackageResponse>>> getAllPackages() {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get package details")
    public ResponseEntity<ApiResponse<ServicePackageResponse>> getPackageById(@PathVariable Integer id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // ========== Landlord APIs ==========

    @PostMapping("/purchase")
    @Operation(summary = "Purchase a package for a room")
    public ResponseEntity<ApiResponse<PurchasePackageResponse>> purchasePackage(
            @Valid @RequestBody PurchasePackageRequest request) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/room/{roomId}")
    @Operation(summary = "Get active package of a room")
    public ResponseEntity<ApiResponse<RoomPackageHistory>> getActivePackage(@PathVariable Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/room/{roomId}/history")
    @Operation(summary = "Get package purchase history of a room")
    public ResponseEntity<ApiResponse<Page<RoomPackageHistory>>> getPackageHistory(
            @PathVariable Long roomId,
            @PageableDefault(size = 10) Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/my-active")
    @Operation(summary = "Get all rooms with active packages")
    public ResponseEntity<ApiResponse<Page<RoomPackageHistory>>> getMyActivePackages(
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/room/{roomId}/renew")
    @Operation(summary = "Renew package for a room")
    public ResponseEntity<ApiResponse<PurchasePackageResponse>> renewPackage(
            @PathVariable Long roomId,
            @RequestParam Integer durationDays) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/room/{roomId}")
    @Operation(summary = "Cancel active package")
    public ResponseEntity<ApiResponse<Void>> cancelPackage(@PathVariable Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
