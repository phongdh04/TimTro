package com.timtro.modules.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Response DTO cho kết quả mua gói dịch vụ.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchasePackageResponse {

    private Long transactionId;
    private Long roomId;
    private String roomTitle;

    // Package info
    private Integer packageId;
    private String packageName;
    private Integer priorityLevel;

    // Payment info
    private BigDecimal amount;
    private String status;

    // Duration
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Integer durationDays;

    // Wallet balance after purchase
    private BigDecimal remainingBalance;
}
