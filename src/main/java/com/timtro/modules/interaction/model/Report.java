package com.timtro.modules.interaction.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reports")
public class Report extends BaseEntity {

    @Column(name = "reporter_id", nullable = false)
    private Long reporterId;

    @Column(name = "room_id", nullable = false)
    private Long roomId;

    @Column(nullable = false, length = 20)
    private String reason; // scam, wrong_price, duplicate, other

    @Column(nullable = false, length = 20)
    private String status = "pending"; // pending, processed, rejected
}
