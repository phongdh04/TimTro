package com.timtro.modules.interaction.service;

import com.timtro.modules.interaction.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Review (đánh giá) operations.
 * Follows Interface Segregation Principle.
 * 
 * Chức năng chính:
 * 1. Tạo review mới
 * 2. Cập nhật review
 * 3. Xóa review
 * 4. Lấy danh sách review theo phòng
 * 5. Lấy thống kê review của phòng
 * 6. Kiểm tra user đã review chưa
 */
public interface ReviewService {

    /** Tạo review mới */
    ReviewResponse createReview(CreateReviewRequest request, Long userId);

    /** Cập nhật review */
    ReviewResponse updateReview(Long reviewId, CreateReviewRequest request, Long userId);

    /** Xóa review */
    void deleteReview(Long reviewId, Long userId);

    /** Lấy danh sách review theo phòng */
    Page<ReviewResponse> getReviewsByRoom(Long roomId, Pageable pageable);

    /** Lấy review của 1 user cho 1 phòng */
    ReviewResponse getReviewByUserAndRoom(Long userId, Long roomId);

    /** Lấy thống kê review của phòng */
    ReviewSummary getReviewSummary(Long roomId);

    /** Kiểm tra user đã review phòng này chưa */
    boolean hasUserReviewed(Long userId, Long roomId);
}
