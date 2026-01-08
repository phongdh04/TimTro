package com.timtro.modules.listing.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "rooms")
public class Room extends BaseEntity {

    @Column(name = "house_id", nullable = false)
    private Long houseId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, unique = true)
    private String slug;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal price;

    @Column(nullable = false, precision = 5, scale = 2)
    private BigDecimal area;

    @Column(name = "district_id", nullable = false)
    private Integer districtId;

    @Column(nullable = false, length = 20)
    private String category; // studio, khep_kin, chung_chu, nguyen_can

    @Column(name = "gender_restriction", length = 10)
    private String genderRestriction = "all"; // all, male, female

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "video_url")
    private String videoUrl;

    @Column(nullable = false, length = 20)
    private String status = "active"; // active, rented, expired, hidden

    @Column(name = "current_package_id")
    private Integer currentPackageId;

    @Column(name = "package_end_date")
    private LocalDateTime packageEndDate;

    @Column(name = "current_priority_level")
    private Integer currentPriorityLevel = 0;

    @Column(name = "last_pushed_at")
    private LocalDateTime lastPushedAt = LocalDateTime.now();

    @Column(name = "view_count")
    private Integer viewCount = 0;

    @Column(name = "save_count")
    private Integer saveCount = 0;
}
