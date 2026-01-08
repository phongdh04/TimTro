package com.timtro.modules.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * DTO lịch sử mua gói của 1 phòng.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomPackageHistory {

    private Long id;
    private Long roomId;
    private String roomTitle;

    private Integer packageId;
    private String packageName;
    private Integer priorityLevel;

    private BigDecimal amountPaid;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status; // active, expired, cancelled

    private LocalDateTime createdAt;
}
