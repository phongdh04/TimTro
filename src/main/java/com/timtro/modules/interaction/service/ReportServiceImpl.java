package com.timtro.modules.interaction.service;

import com.timtro.modules.interaction.dto.*;
import com.timtro.modules.interaction.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;
    // TODO: Inject RoomService, UserService

    @Override
    @Transactional
    public ReportResponse createReport(CreateReportRequest request, Long userId) {
        // TODO: Implement
        // 1. Kiểm tra phòng tồn tại
        // 2. Tạo Report entity
        // 3. Có thể gửi notification cho admin
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ReportResponse> getReportsByStatus(String status, Pageable pageable) {
        // TODO: Implement (admin only)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ReportResponse> getAllReports(Pageable pageable) {
        // TODO: Implement (admin only)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public ReportResponse getReportById(Long reportId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void processReport(Long reportId, String action) {
        // TODO: Implement (admin only)
        // action: processed (xử lý xong), rejected (từ chối)
        // Có thể ẩn phòng nếu report hợp lệ
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ReportResponse> getReportsByRoom(Long roomId, Pageable pageable) {
        // TODO: Implement (admin only)
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
