package com.timtro.modules.listing.web;

import com.timtro.core.base.BaseController;
import com.timtro.core.common.ApiResponse;
import com.timtro.modules.listing.dto.RoomRequest;
import com.timtro.modules.listing.dto.RoomResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/landlord/rooms")
@Tag(name = "Landlord - Rooms", description = "Quản lý bài đăng (Dành cho Chủ trọ)")
public class LandlordRoomController extends BaseController {

    @Operation(summary = "Đăng tin mới")
    @PostMapping
    public ResponseEntity<ApiResponse<RoomResponse>> createRoom(@Valid @RequestBody RoomRequest request) {
        // Architecture Skeleton Only
        return null;
    }

    @Operation(summary = "Cập nhật tin đăng")
    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<RoomResponse>> updateRoom(@PathVariable Long id,
            @Valid @RequestBody RoomRequest request) {
        // Architecture Skeleton Only
        return null;
    }

    @Operation(summary = "Xóa tin đăng (Ẩn)")
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteRoom(@PathVariable Long id) {
        // Architecture Skeleton Only
        return null;
    }
}
