package com.timtro.modules.chat.service;

import com.timtro.modules.chat.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Conversation operations.
 * 
 * Chức năng chính:
 * 1. Lấy danh sách cuộc hội thoại của user (có phân trang)
 * 2. Lấy chi tiết 1 cuộc hội thoại
 * 3. Tạo cuộc hội thoại mới (hoặc trả về existing nếu đã có)
 * 4. Archive (ẩn) cuộc hội thoại
 * 5. Đếm tổng số tin nhắn chưa đọc
 */
public interface ConversationService {

    /** Lấy danh sách conversations của user */
    Page<ConversationResponse> getConversationsByUserId(Long userId, Pageable pageable);

    /** Lấy chi tiết 1 conversation */
    ConversationResponse getConversationById(Long conversationId, Long currentUserId);

    /** Tạo conversation mới giữa student và landlord */
    ConversationResponse createConversation(CreateConversationRequest request, Long currentUserId);

    /** Archive (ẩn) conversation */
    void archiveConversation(Long conversationId, Long currentUserId);

    /** Lấy tổng số tin nhắn chưa đọc của user */
    Long getTotalUnreadCount(Long userId);
}
