package com.timtro.modules.chat.service;

import com.timtro.modules.chat.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Message operations.
 * 
 * Chức năng chính:
 * 1. Lấy danh sách tin nhắn trong conversation (có phân trang)
 * 2. Gửi tin nhắn mới
 * 3. Đánh dấu tin nhắn đã đọc
 * 4. Đếm tin nhắn chưa đọc trong conversation
 */
public interface MessageService {

    /** Lấy danh sách messages trong conversation */
    Page<MessageResponse> getMessagesByConversationId(Long conversationId, Long currentUserId, Pageable pageable);

    /** Gửi tin nhắn mới */
    MessageResponse sendMessage(SendMessageRequest request, Long currentUserId);

    /** Đánh dấu tin nhắn đã đọc */
    void markAsRead(MarkAsReadRequest request, Long currentUserId);

    /** Đếm số tin nhắn chưa đọc trong conversation */
    Long getUnreadCount(Long conversationId, Long currentUserId);
}
