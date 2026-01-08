package com.timtro.modules.interaction.service;

import com.timtro.modules.interaction.dto.FavoriteResponse;
import com.timtro.modules.interaction.repository.FavoriteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class FavoriteServiceImpl implements FavoriteService {

    private final FavoriteRepository favoriteRepository;
    // TODO: Inject RoomService để lấy thông tin phòng

    @Override
    @Transactional
    public void addFavorite(Long roomId, Long userId) {
        // TODO: Implement
        // 1. Kiểm tra phòng tồn tại
        // 2. Kiểm tra đã lưu chưa
        // 3. Tạo Favorite entity
        // 4. Cập nhật save_count của Room
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void removeFavorite(Long roomId, Long userId) {
        // TODO: Implement
        // 1. Xóa Favorite
        // 2. Giảm save_count của Room
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public boolean toggleFavorite(Long roomId, Long userId) {
        // TODO: Implement
        // Return true nếu sau toggle là đã lưu, false nếu đã bỏ lưu
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<FavoriteResponse> getFavoritesByUser(Long userId, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public boolean isFavorite(Long roomId, Long userId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Long countFavoritesByRoom(Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
