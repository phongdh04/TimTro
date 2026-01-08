package com.timtro.modules.chat.repository;

import com.timtro.modules.chat.model.Conversation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {

    @Query("SELECT c FROM Conversation c WHERE (c.studentId = :userId OR c.landlordId = :userId) AND c.isArchived = false ORDER BY c.lastMessageAt DESC")
    Page<Conversation> findByUserId(Long userId, Pageable pageable);

    Optional<Conversation> findByStudentIdAndLandlordIdAndRoomId(Long studentId, Long landlordId, Long roomId);
}
