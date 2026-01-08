package com.timtro.modules.search.service;

import com.timtro.modules.search.dto.*;

import java.util.List;

/**
 * Service interface cho Location (District, University) operations.
 * Follows Interface Segregation Principle.
 * 
 * Chức năng chính:
 * 1. Lấy danh sách districts
 * 2. Lấy danh sách universities
 * 3. Tìm district/university theo slug
 * 4. Lấy universities trong district
 */
public interface LocationService {

    /** Lấy tất cả districts */
    List<DistrictResponse> getAllDistricts();

    /** Lấy district theo ID */
    DistrictResponse getDistrictById(Long id);

    /** Lấy district theo slug */
    DistrictResponse getDistrictBySlug(String slug);

    /** Lấy tất cả universities */
    List<UniversityResponse> getAllUniversities();

    /** Lấy university theo ID */
    UniversityResponse getUniversityById(Long id);

    /** Lấy university theo slug */
    UniversityResponse getUniversityBySlug(String slug);

    /** Lấy universities trong 1 district */
    List<UniversityResponse> getUniversitiesByDistrict(Long districtId);

    /** Tìm universities gần vị trí */
    List<UniversityResponse> findNearbyUniversities(Double latitude, Double longitude, Double radiusKm);
}
