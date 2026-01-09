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
@RequestMapping("/api/v1/rooms")
@Tag(name = "Rooms (Public)", description = "Tìm kiếm và Xem chi tiết phòng trọ")
public class RoomController extends BaseController {

    @Operation(summary = "Tìm kiếm phòng trọ (Filter)")
    @GetMapping
    public ResponseEntity<ApiResponse<List<RoomResponse>>> searchRooms(
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {
        // Architecture Skeleton Only
        return null;
    }

    @Operation(summary = "Xem chi tiết phòng trọ")
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<RoomResponse>> getRoomDetail(@PathVariable Long id) {
        // Architecture Skeleton Only
        return null;
    }
}
