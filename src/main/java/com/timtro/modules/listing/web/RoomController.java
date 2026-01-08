package com.timtro.modules.listing.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.listing.dto.*;
import com.timtro.modules.listing.service.RoomService;
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
 * REST Controller for Room management.
 * 
 * Public APIs (không cần auth):
 * 1. GET /v1/rooms - Tìm kiếm phòng
 * 2. GET /v1/rooms/{id} - Chi tiết phòng theo ID
 * 3. GET /v1/rooms/slug/{slug} - Chi tiết phòng theo slug
 * 
 * Landlord APIs (cần auth + role landlord):
 * 4. POST /v1/rooms - Tạo phòng mới
 * 5. PUT /v1/rooms/{id} - Cập nhật phòng
 * 6. DELETE /v1/rooms/{id} - Xóa phòng
 * 7. POST /v1/rooms/{id}/push - Đẩy tin
 * 8. PUT /v1/rooms/{id}/status - Thay đổi trạng thái
 * 9. GET /v1/rooms/my-rooms - Phòng của tôi
 */
@RestController
@RequestMapping("/v1/rooms")
@RequiredArgsConstructor
@Tag(name = "Rooms", description = "Room listing management APIs")
public class RoomController {

    private final RoomService roomService;

    // ========== Public APIs ==========

    @GetMapping
    @Operation(summary = "Search rooms with filters")
    public ResponseEntity<ApiResponse<Page<RoomListResponse>>> searchRooms(
            RoomSearchCriteria criteria,
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get room details by ID")
    public ResponseEntity<ApiResponse<RoomDetailResponse>> getRoomById(@PathVariable Long id) {
        // TODO: Implement
        // Also increment view count
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/slug/{slug}")
    @Operation(summary = "Get room details by slug (SEO-friendly)")
    public ResponseEntity<ApiResponse<RoomDetailResponse>> getRoomBySlug(@PathVariable String slug) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // ========== Landlord APIs ==========

    @PostMapping
    @Operation(summary = "Create a new room listing")
    public ResponseEntity<ApiResponse<RoomDetailResponse>> createRoom(
            @Valid @RequestBody CreateRoomRequest request) {
        // TODO: Implement - Get landlordId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update room listing")
    public ResponseEntity<ApiResponse<RoomDetailResponse>> updateRoom(
            @PathVariable Long id,
            @Valid @RequestBody UpdateRoomRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete room listing (soft delete)")
    public ResponseEntity<ApiResponse<Void>> deleteRoom(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/{id}/push")
    @Operation(summary = "Push room to top of listings")
    public ResponseEntity<ApiResponse<Void>> pushRoom(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PutMapping("/{id}/status")
    @Operation(summary = "Change room status (active, rented, hidden)")
    public ResponseEntity<ApiResponse<Void>> changeStatus(
            @PathVariable Long id,
            @RequestParam String status) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/my-rooms")
    @Operation(summary = "Get all rooms owned by current landlord")
    public ResponseEntity<ApiResponse<Page<RoomListResponse>>> getMyRooms(
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement - Get landlordId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
