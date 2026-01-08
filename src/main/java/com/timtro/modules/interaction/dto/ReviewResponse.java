package com.timtro.modules.interaction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Response DTO cho Review.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResponse {

    private Long id;
    private Long roomId;

    // Reviewer info
    private Long userId;
    private String userName;
    private String userAvatar;

    private Integer rating;
    private String comment;
    private String criteriaRating; // JSON

    private Boolean isVerifiedTenant;
    private LocalDateTime createdAt;
}
