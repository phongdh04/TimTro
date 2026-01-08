package com.timtro.modules.interaction.service;

import com.timtro.modules.interaction.dto.FavoriteResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Favorite (lưu phòng yêu thích) operations.
 * Follows Interface Segregation Principle.
 * 
 * Chức năng chính:
 * 1. Thêm phòng vào danh sách yêu thích
 * 2. Xóa phòng khỏi danh sách yêu thích
 * 3. Lấy danh sách phòng yêu thích
 * 4. Kiểm tra phòng đã được lưu chưa
 * 5. Toggle trạng thái yêu thích
 */
public interface FavoriteService {

    /** Thêm phòng vào danh sách yêu thích */
    void addFavorite(Long roomId, Long userId);

    /** Xóa phòng khỏi danh sách yêu thích */
    void removeFavorite(Long roomId, Long userId);

    /** Toggle trạng thái yêu thích (thêm nếu chưa có, xóa nếu đã có) */
    boolean toggleFavorite(Long roomId, Long userId);

    /** Lấy danh sách phòng yêu thích của user */
    Page<FavoriteResponse> getFavoritesByUser(Long userId, Pageable pageable);

    /** Kiểm tra phòng đã được lưu chưa */
    boolean isFavorite(Long roomId, Long userId);

    /** Đếm số lượt lưu của 1 phòng */
    Long countFavoritesByRoom(Long roomId);
}
