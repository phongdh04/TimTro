package com.timtro.modules.chat.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.chat.dto.*;
import com.timtro.modules.chat.service.MessageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Message management.
 * 
 * API Endpoints:
 * 1. GET /v1/messages/conversation/{conversationId} - Lấy tin nhắn trong
 * conversation
 * 2. POST /v1/messages - Gửi tin nhắn mới
 * 3. POST /v1/messages/mark-read - Đánh dấu đã đọc
 * 4. GET /v1/messages/conversation/{conversationId}/unread-count - Đếm tin nhắn
 * chưa đọc
 */
@RestController
@RequestMapping("/v1/messages")
@RequiredArgsConstructor
@Tag(name = "Messages", description = "Message management APIs")
public class MessageController {

    private final MessageService messageService;

    @GetMapping("/conversation/{conversationId}")
    @Operation(summary = "Get all messages in a conversation")
    public ResponseEntity<ApiResponse<Page<MessageResponse>>> getMessagesByConversation(
            @PathVariable Long conversationId,
            @PageableDefault(size = 50) Pageable pageable) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping
    @Operation(summary = "Send a new message")
    public ResponseEntity<ApiResponse<MessageResponse>> sendMessage(
            @Valid @RequestBody SendMessageRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/mark-read")
    @Operation(summary = "Mark messages as read in a conversation")
    public ResponseEntity<ApiResponse<Void>> markAsRead(
            @Valid @RequestBody MarkAsReadRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/conversation/{conversationId}/unread-count")
    @Operation(summary = "Get unread message count for a conversation")
    public ResponseEntity<ApiResponse<Long>> getUnreadCount(@PathVariable Long conversationId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
