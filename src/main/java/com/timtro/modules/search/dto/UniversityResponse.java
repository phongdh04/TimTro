package com.timtro.modules.search.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO response cho University.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UniversityResponse {

    private Long id;
    private String name;
    private String slug;
    private String address;
    private Double latitude;
    private Double longitude;
    private String districtName;
    private Long nearbyRoomCount; // Số phòng trong bán kính 3km
}
