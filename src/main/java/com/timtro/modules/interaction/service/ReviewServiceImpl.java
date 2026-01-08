package com.timtro.modules.interaction.service;

import com.timtro.modules.interaction.dto.*;
import com.timtro.modules.interaction.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    // TODO: Inject RoomService, UserService

    @Override
    @Transactional
    public ReviewResponse createReview(CreateReviewRequest request, Long userId) {
        // TODO: Implement
        // 1. Kiểm tra phòng tồn tại
        // 2. Kiểm tra user đã review chưa
        // 3. Tạo Review entity
        // 4. Cập nhật avg_rating của Room/BoardingHouse
        // 5. Kiểm tra isVerifiedTenant (nếu user từng thuê phòng này)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public ReviewResponse updateReview(Long reviewId, CreateReviewRequest request, Long userId) {
        // TODO: Implement
        // 1. Tìm review và validate ownership
        // 2. Cập nhật fields
        // 3. Recalculate avg_rating
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void deleteReview(Long reviewId, Long userId) {
        // TODO: Implement
        // 1. Validate ownership
        // 2. Delete review
        // 3. Recalculate avg_rating
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ReviewResponse> getReviewsByRoom(Long roomId, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public ReviewResponse getReviewByUserAndRoom(Long userId, Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public ReviewSummary getReviewSummary(Long roomId) {
        // TODO: Implement
        // Tính toán avg rating, count theo từng sao, avg theo tiêu chí
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public boolean hasUserReviewed(Long userId, Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
