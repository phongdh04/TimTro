package com.timtro.modules.interaction.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reviews")
public class Review extends BaseEntity {

    @Column(name = "room_id", nullable = false)
    private Long roomId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Integer rating;

    @Column(columnDefinition = "TEXT")
    private String comment;

    @Column(name = "criteria_rating", columnDefinition = "JSON")
    private String criteriaRating; // JSON: {"security": 5, "cleanliness": 4}

    @Column(name = "is_verified_tenant")
    private Boolean isVerifiedTenant = false;
}
