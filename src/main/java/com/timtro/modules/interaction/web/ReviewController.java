package com.timtro.modules.interaction.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.interaction.dto.*;
import com.timtro.modules.interaction.service.ReviewService;
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
 * REST Controller for Review (đánh giá) operations.
 * 
 * API Endpoints:
 * 1. POST /v1/reviews - Tạo review
 * 2. PUT /v1/reviews/{id} - Cập nhật review
 * 3. DELETE /v1/reviews/{id} - Xóa review
 * 4. GET /v1/reviews/room/{roomId} - Reviews của phòng
 * 5. GET /v1/reviews/room/{roomId}/summary - Thống kê review
 * 6. GET /v1/reviews/room/{roomId}/check - Kiểm tra đã review chưa
 */
@RestController
@RequestMapping("/v1/reviews")
@RequiredArgsConstructor
@Tag(name = "Reviews", description = "Review management APIs")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    @Operation(summary = "Create a new review")
    public ResponseEntity<ApiResponse<ReviewResponse>> createReview(
            @Valid @RequestBody CreateReviewRequest request) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update a review")
    public ResponseEntity<ApiResponse<ReviewResponse>> updateReview(
            @PathVariable Long id,
            @Valid @RequestBody CreateReviewRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a review")
    public ResponseEntity<ApiResponse<Void>> deleteReview(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/room/{roomId}")
    @Operation(summary = "Get all reviews for a room")
    public ResponseEntity<ApiResponse<Page<ReviewResponse>>> getReviewsByRoom(
            @PathVariable Long roomId,
            @PageableDefault(size = 10) Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/room/{roomId}/summary")
    @Operation(summary = "Get review summary/statistics for a room")
    public ResponseEntity<ApiResponse<ReviewSummary>> getReviewSummary(@PathVariable Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/room/{roomId}/check")
    @Operation(summary = "Check if current user has reviewed this room")
    public ResponseEntity<ApiResponse<Boolean>> checkUserReviewed(@PathVariable Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
