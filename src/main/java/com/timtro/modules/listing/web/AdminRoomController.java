package com.timtro.modules.listing.web;

import com.timtro.core.base.BaseController;
import com.timtro.core.common.ApiResponse;
import com.timtro.modules.listing.dto.RoomResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/rooms")
@Tag(name = "Admin - Rooms", description = "Kiểm duyệt bài đăng (Dành cho Admin)")
public class AdminRoomController extends BaseController {

    @Operation(summary = "Lấy danh sách bài chờ duyệt")
    @GetMapping("/pending")
    public ResponseEntity<ApiResponse<List<RoomResponse>>> getPendingRooms() {
        // Architecture Skeleton Only
        return null;
    }

    @Operation(summary = "Duyệt bài đăng")
    @PostMapping("/{id}/approve")
    public ResponseEntity<ApiResponse<Void>> approveRoom(@PathVariable Long id) {
        // Architecture Skeleton Only
        return null;
    }

    @Operation(summary = "Từ chối / Gỡ bài")
    @PostMapping("/{id}/reject")
    public ResponseEntity<ApiResponse<Void>> rejectRoom(@PathVariable Long id, @RequestParam String reason) {
        // Architecture Skeleton Only
        return null;
    }
}
