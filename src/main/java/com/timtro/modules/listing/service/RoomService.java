package com.timtro.modules.listing.service;

import com.timtro.modules.listing.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Room operations.
 * Follows Interface Segregation Principle - chỉ xử lý Room.
 * 
 * Chức năng chính:
 * 1. Tạo phòng mới
 * 2. Lấy chi tiết phòng
 * 3. Cập nhật phòng
 * 4. Xóa phòng (soft delete)
 * 5. Tìm kiếm phòng với nhiều tiêu chí
 * 6. Đẩy tin (push room)
 * 7. Thay đổi trạng thái phòng
 * 8. Lấy phòng theo landlord
 */
public interface RoomService {

    /** Tạo phòng mới */
    RoomDetailResponse createRoom(CreateRoomRequest request, Long landlordId);

    /** Lấy chi tiết phòng theo ID */
    RoomDetailResponse getRoomById(Long id);

    /** Lấy chi tiết phòng theo slug (SEO-friendly) */
    RoomDetailResponse getRoomBySlug(String slug);

    /** Cập nhật phòng */
    RoomDetailResponse updateRoom(Long id, UpdateRoomRequest request, Long landlordId);

    /** Xóa phòng (soft delete) */
    void deleteRoom(Long id, Long landlordId);

    /** Tìm kiếm phòng với filter */
    Page<RoomListResponse> searchRooms(RoomSearchCriteria criteria, Pageable pageable);

    /** Đẩy tin lên top */
    void pushRoom(Long id, Long landlordId);

    /** Thay đổi trạng thái phòng */
    void changeStatus(Long id, String status, Long landlordId);

    /** Lấy danh sách phòng của landlord */
    Page<RoomListResponse> getRoomsByLandlord(Long landlordId, Pageable pageable);

    /** Tăng view count (gọi khi xem chi tiết) */
    void incrementViewCount(Long id);
}
