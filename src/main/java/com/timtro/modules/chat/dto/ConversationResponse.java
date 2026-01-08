package com.timtro.modules.chat.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConversationResponse {

    private Long id;
    private Long studentId;
    private String studentName;
    private String studentAvatar;
    private Long landlordId;
    private String landlordName;
    private String landlordAvatar;
    private Long roomId;
    private String roomTitle;
    private String lastMessageContent;
    private LocalDateTime lastMessageAt;
    private Long unreadCount;
    private Boolean isArchived;
    private LocalDateTime createdAt;
}
