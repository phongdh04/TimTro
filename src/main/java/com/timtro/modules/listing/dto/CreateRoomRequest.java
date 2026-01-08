package com.timtro.modules.listing.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Request DTO for creating a new room listing.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateRoomRequest {

    @NotNull(message = "House ID is required")
    private Long houseId;

    @NotBlank(message = "Title is required")
    @Size(max = 255, message = "Title must not exceed 255 characters")
    private String title;

    @NotNull(message = "Price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private BigDecimal price;

    @NotNull(message = "Area is required")
    @DecimalMin(value = "1.0", message = "Area must be at least 1 m²")
    private BigDecimal area;

    @NotNull(message = "District ID is required")
    private Integer districtId;

    @NotBlank(message = "Category is required")
    private String category; // studio, khep_kin, chung_chu, nguyen_can

    private String genderRestriction = "all"; // all, male, female

    private String thumbnailUrl;
    private String videoUrl;
}
