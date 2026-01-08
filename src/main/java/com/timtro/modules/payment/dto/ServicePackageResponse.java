package com.timtro.modules.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Response DTO cho thông tin gói dịch vụ.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicePackageResponse {

    private Integer id;
    private String name;
    private String description;
    private BigDecimal pricePerDay;
    private Integer priorityLevel;
    private Integer maxPushPerDay;
    private Boolean isActive;

    // Thông tin thêm
    private String benefits; // JSON array of benefits
    private String badge; // Label hiển thị: "Phổ biến", "Tiết kiệm"
}
