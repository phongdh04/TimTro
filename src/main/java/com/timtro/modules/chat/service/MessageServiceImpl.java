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
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;
    private final ConversationRepository conversationRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<MessageResponse> getMessagesByConversationId(Long conversationId, Long currentUserId,
            Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public MessageResponse sendMessage(SendMessageRequest request, Long currentUserId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void markAsRead(MarkAsReadRequest request, Long currentUserId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Long getUnreadCount(Long conversationId, Long currentUserId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
