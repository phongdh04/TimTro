package com.timtro.modules.chat.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.chat.dto.*;
import com.timtro.modules.chat.service.ConversationService;
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
 * REST Controller for Conversation management.
 * 
 * API Endpoints:
 * 1. GET /v1/conversations - Lấy danh sách conversations của user
 * 2. GET /v1/conversations/{id} - Lấy chi tiết 1 conversation
 * 3. POST /v1/conversations - Tạo conversation mới
 * 4. DELETE /v1/conversations/{id} - Archive conversation
 * 5. GET /v1/conversations/unread-count - Lấy tổng số tin nhắn chưa đọc
 */
@RestController
@RequestMapping("/v1/conversations")
@RequiredArgsConstructor
@Tag(name = "Conversations", description = "Conversation management APIs")
public class ConversationController {

    private final ConversationService conversationService;

    @GetMapping
    @Operation(summary = "Get all conversations for current user")
    public ResponseEntity<ApiResponse<Page<ConversationResponse>>> getMyConversations(
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get a specific conversation by ID")
    public ResponseEntity<ApiResponse<ConversationResponse>> getConversationById(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping
    @Operation(summary = "Create a new conversation or return existing one")
    public ResponseEntity<ApiResponse<ConversationResponse>> createConversation(
            @Valid @RequestBody CreateConversationRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Archive a conversation")
    public ResponseEntity<ApiResponse<Void>> archiveConversation(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/unread-count")
    @Operation(summary = "Get total unread message count across all conversations")
    public ResponseEntity<ApiResponse<Long>> getTotalUnreadCount() {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
