package com.timtro.modules.interaction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO tổng hợp thống kê đánh giá của 1 phòng.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewSummary {

    private Long roomId;
    private Double averageRating;
    private Long totalReviews;

    // Phân bổ rating (số lượng mỗi mức sao)
    private Long fiveStarCount;
    private Long fourStarCount;
    private Long threeStarCount;
    private Long twoStarCount;
    private Long oneStarCount;

    // Trung bình theo tiêu chí
    private Double avgSecurity;
    private Double avgCleanliness;
    private Double avgPrice;
    private Double avgLocation;
}
