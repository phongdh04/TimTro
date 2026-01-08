package com.timtro.modules.listing.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Request DTO để cập nhật thông tin Room.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateRoomRequest {

    @Size(max = 255, message = "Title must not exceed 255 characters")
    private String title;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private BigDecimal price;

    @DecimalMin(value = "1.0", message = "Area must be at least 1 m²")
    private BigDecimal area;

    private Integer districtId;
    private String category;
    private String genderRestriction;
    private String thumbnailUrl;
    private String videoUrl;
    private String status;
}
