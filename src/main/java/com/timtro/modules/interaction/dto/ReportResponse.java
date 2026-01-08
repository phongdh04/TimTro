package com.timtro.modules.interaction.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Response DTO cho Report (dùng cho admin).
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportResponse {

    private Long id;

    // Reporter info
    private Long reporterId;
    private String reporterName;

    // Room info
    private Long roomId;
    private String roomTitle;
    private Long landlordId;
    private String landlordName;

    private String reason;
    private String description;
    private String status; // pending, processed, rejected

    private LocalDateTime createdAt;
    private LocalDateTime processedAt;
}
