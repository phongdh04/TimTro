package com.timtro.modules.interaction.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.interaction.dto.FavoriteResponse;
import com.timtro.modules.interaction.service.FavoriteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Favorite (lưu phòng) operations.
 * 
 * API Endpoints:
 * 1. POST /v1/favorites/{roomId} - Thêm vào yêu thích
 * 2. DELETE /v1/favorites/{roomId} - Xóa khỏi yêu thích
 * 3. POST /v1/favorites/{roomId}/toggle - Toggle trạng thái
 * 4. GET /v1/favorites - Danh sách phòng đã lưu
 * 5. GET /v1/favorites/{roomId}/check - Kiểm tra đã lưu chưa
 */
@RestController
@RequestMapping("/v1/favorites")
@RequiredArgsConstructor
@Tag(name = "Favorites", description = "Favorite room management APIs")
public class FavoriteController {

    private final FavoriteService favoriteService;

    @PostMapping("/{roomId}")
    @Operation(summary = "Add room to favorites")
    public ResponseEntity<ApiResponse<Void>> addFavorite(@PathVariable Long roomId) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/{roomId}")
    @Operation(summary = "Remove room from favorites")
    public ResponseEntity<ApiResponse<Void>> removeFavorite(@PathVariable Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/{roomId}/toggle")
    @Operation(summary = "Toggle favorite status")
    public ResponseEntity<ApiResponse<Boolean>> toggleFavorite(@PathVariable Long roomId) {
        // TODO: Implement
        // Returns true if now favorited, false if unfavorited
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping
    @Operation(summary = "Get all favorite rooms")
    public ResponseEntity<ApiResponse<Page<FavoriteResponse>>> getFavorites(
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/{roomId}/check")
    @Operation(summary = "Check if room is in favorites")
    public ResponseEntity<ApiResponse<Boolean>> checkFavorite(@PathVariable Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
