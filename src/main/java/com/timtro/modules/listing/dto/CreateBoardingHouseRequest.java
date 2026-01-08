package com.timtro.modules.listing.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Request DTO để tạo BoardingHouse mới.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBoardingHouseRequest {

    @NotNull(message = "District ID is required")
    private Integer districtId;

    @NotBlank(message = "Name is required")
    @Size(max = 255, message = "Name must not exceed 255 characters")
    private String name;

    private String addressDetail;

    // Coordinates
    private Double latitude;
    private Double longitude;

    // Service costs as JSON string
    private String serviceCosts;

    // Amenities as JSON string
    private String amenities;
}
