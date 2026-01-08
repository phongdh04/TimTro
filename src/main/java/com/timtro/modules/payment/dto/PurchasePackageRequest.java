package com.timtro.modules.payment.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Request DTO để mua gói dịch vụ cho phòng.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PurchasePackageRequest {

    @NotNull(message = "Room ID is required")
    private Long roomId;

    @NotNull(message = "Package ID is required")
    private Integer packageId;

    // Số ngày áp dụng (nếu package cho phép chọn)
    private Integer durationDays;
}
