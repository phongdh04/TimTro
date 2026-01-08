package com.timtro.modules.chat.service;

import com.timtro.modules.chat.dto.*;
import com.timtro.modules.chat.repository.ConversationRepository;
import com.timtro.modules.chat.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ConversationServiceImpl implements ConversationService {

    private final ConversationRepository conversationRepository;
    private final MessageRepository messageRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<ConversationResponse> getConversationsByUserId(Long userId, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public ConversationResponse getConversationById(Long conversationId, Long currentUserId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public ConversationResponse createConversation(CreateConversationRequest request, Long currentUserId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void archiveConversation(Long conversationId, Long currentUserId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Long getTotalUnreadCount(Long userId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
