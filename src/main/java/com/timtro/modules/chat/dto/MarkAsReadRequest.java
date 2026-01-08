package com.timtro.modules.chat.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarkAsReadRequest {

    @NotNull(message = "Conversation ID is required")
    private Long conversationId;

    private Long lastReadMessageId;
}
