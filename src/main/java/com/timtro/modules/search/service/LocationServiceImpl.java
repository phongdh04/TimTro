package com.timtro.modules.search.service;

import com.timtro.modules.search.dto.*;
import com.timtro.modules.listing.repository.DistrictRepository;
import com.timtro.modules.listing.repository.UniversityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class LocationServiceImpl implements LocationService {

    private final DistrictRepository districtRepository;
    private final UniversityRepository universityRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DistrictResponse> getAllDistricts() {
        // TODO: Implement
        // Include room count per district
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public DistrictResponse getDistrictById(Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public DistrictResponse getDistrictBySlug(String slug) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public List<UniversityResponse> getAllUniversities() {
        // TODO: Implement
        // Include nearby room count
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public UniversityResponse getUniversityById(Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public UniversityResponse getUniversityBySlug(String slug) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public List<UniversityResponse> getUniversitiesByDistrict(Long districtId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public List<UniversityResponse> findNearbyUniversities(Double latitude, Double longitude, Double radiusKm) {
        // TODO: Implement
        // Use spatial query
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
