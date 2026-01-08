package com.timtro.modules.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO response cho District.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistrictResponse {

    private Long id;
    private String name;
    private String slug;
    private Integer cityId;
    private String cityName;
    private Long roomCount; // Số phòng đang active
}
