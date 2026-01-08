package com.timtro.modules.interaction.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Request DTO để tạo Report (báo cáo vi phạm).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateReportRequest {

    @NotNull(message = "Room ID is required")
    private Long roomId;

    @NotBlank(message = "Reason is required")
    private String reason; // scam, wrong_price, duplicate, inappropriate, other

    @Size(max = 500, message = "Description must not exceed 500 characters")
    private String description;
}
