package com.timtro.modules.listing.service;

import com.timtro.modules.listing.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for BoardingHouse operations.
 * Follows Interface Segregation Principle - chỉ xử lý BoardingHouse.
 * 
 * Chức năng chính:
 * 1. Tạo nhà trọ mới
 * 2. Lấy chi tiết nhà trọ
 * 3. Cập nhật nhà trọ
 * 4. Xóa nhà trọ
 * 5. Lấy danh sách nhà trọ của landlord
 * 6. Xác minh nhà trọ (admin)
 */
public interface BoardingHouseService {

    /** Tạo nhà trọ mới */
    BoardingHouseResponse createBoardingHouse(CreateBoardingHouseRequest request, Long landlordId);

    /** Lấy chi tiết nhà trọ */
    BoardingHouseResponse getBoardingHouseById(Long id);

    /** Cập nhật nhà trọ */
    BoardingHouseResponse updateBoardingHouse(Long id, CreateBoardingHouseRequest request, Long landlordId);

    /** Xóa nhà trọ */
    void deleteBoardingHouse(Long id, Long landlordId);

    /** Lấy danh sách nhà trọ của landlord */
    Page<BoardingHouseResponse> getBoardingHousesByLandlord(Long landlordId, Pageable pageable);

    /** Xác minh nhà trọ (admin only) */
    void verifyBoardingHouse(Long id, boolean verified);
}
