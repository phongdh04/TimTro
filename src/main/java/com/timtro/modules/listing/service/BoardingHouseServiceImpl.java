package com.timtro.modules.listing.service;

import com.timtro.modules.listing.dto.*;
import com.timtro.modules.listing.repository.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class BoardingHouseServiceImpl implements BoardingHouseService {

    private final BoardingHouseRepository boardingHouseRepository;
    private final RoomRepository roomRepository;
    private final DistrictRepository districtRepository;

    @Override
    @Transactional
    public BoardingHouseResponse createBoardingHouse(CreateBoardingHouseRequest request, Long landlordId) {
        // TODO: Implement
        // 1. Create entity
        // 2. Set location point from lat/lng
        // 3. Calculate nearby bus routes
        // 4. Save and return
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public BoardingHouseResponse getBoardingHouseById(Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public BoardingHouseResponse updateBoardingHouse(Long id, CreateBoardingHouseRequest request, Long landlordId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void deleteBoardingHouse(Long id, Long landlordId) {
        // TODO: Implement
        // Note: Should check if house has active rooms
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<BoardingHouseResponse> getBoardingHousesByLandlord(Long landlordId, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void verifyBoardingHouse(Long id, boolean verified) {
        // TODO: Implement (admin only)
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
