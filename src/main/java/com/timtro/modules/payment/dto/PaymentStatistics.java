package com.timtro.modules.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * DTO thống kê thanh toán của landlord.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentStatistics {

    private Long userId;

    // Tổng quan ví
    private BigDecimal currentBalance;
    private BigDecimal totalDeposited;
    private BigDecimal totalSpent;

    // Phân tích chi tiêu
    private BigDecimal spentOnPackages;
    private BigDecimal spentOnPushFees;
    private BigDecimal totalRefunded;

    // Thống kê theo thời gian
    private BigDecimal thisMonthDeposit;
    private BigDecimal thisMonthSpent;
    private BigDecimal lastMonthDeposit;
    private BigDecimal lastMonthSpent;
}
