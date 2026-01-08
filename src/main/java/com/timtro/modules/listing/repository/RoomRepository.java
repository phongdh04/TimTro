package com.timtro.modules.listing.repository;

import com.timtro.modules.listing.model.Room;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long>, JpaSpecificationExecutor<Room> {

    Optional<Room> findBySlug(String slug);

    boolean existsBySlug(String slug);

    Page<Room> findByStatus(String status, Pageable pageable);

    Page<Room> findByStatusAndDistrictId(String status, Integer districtId, Pageable pageable);

    Page<Room> findByHouseId(Long houseId, Pageable pageable);

    @Modifying
    @Query("UPDATE Room r SET r.viewCount = r.viewCount + 1 WHERE r.id = :roomId")
    void incrementViewCount(Long roomId);

    @Modifying
    @Query("UPDATE Room r SET r.lastPushedAt = :now WHERE r.id = :roomId")
    void pushRoom(Long roomId, LocalDateTime now);
}
