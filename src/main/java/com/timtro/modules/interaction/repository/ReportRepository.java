package com.timtro.modules.interaction.repository;

import com.timtro.modules.interaction.model.Report;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

    Page<Report> findByStatus(String status, Pageable pageable);

    Page<Report> findByRoomId(Long roomId, Pageable pageable);

    boolean existsByReporterIdAndRoomId(Long reporterId, Long roomId);
}
