package com.timtro.modules.interaction.service;

import com.timtro.modules.interaction.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service interface for Report (báo cáo vi phạm) operations.
 * Follows Interface Segregation Principle.
 * 
 * Chức năng chính:
 * 1. Tạo report mới
 * 2. Lấy danh sách report (admin)
 * 3. Xử lý report (admin)
 * 4. Lấy report theo ID
 */
public interface ReportService {

    /** Tạo report mới */
    ReportResponse createReport(CreateReportRequest request, Long userId);

    /** Lấy danh sách report theo status (admin) */
    Page<ReportResponse> getReportsByStatus(String status, Pageable pageable);

    /** Lấy tất cả reports (admin) */
    Page<ReportResponse> getAllReports(Pageable pageable);

    /** Lấy report theo ID */
    ReportResponse getReportById(Long reportId);

    /** Xử lý report - đánh dấu đã xử lý (admin) */
    void processReport(Long reportId, String action); // action: processed, rejected

    /** Lấy reports của 1 phòng (admin) */
    Page<ReportResponse> getReportsByRoom(Long roomId, Pageable pageable);
}
