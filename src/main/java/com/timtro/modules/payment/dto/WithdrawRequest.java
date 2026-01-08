package com.timtro.modules.payment.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Request DTO để rút tiền.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawRequest {

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "50000", message = "Minimum withdrawal is 50,000 VND")
    private BigDecimal amount;

    @NotNull(message = "Bank name is required")
    private String bankName;

    @NotNull(message = "Account number is required")
    private String accountNumber;

    @NotNull(message = "Account holder name is required")
    private String accountHolderName;

    private String note;
}
