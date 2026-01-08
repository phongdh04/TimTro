package com.timtro.modules.interaction.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.interaction.dto.*;
import com.timtro.modules.interaction.service.ReportService;
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
 * REST Controller for Report (báo cáo vi phạm) operations.
 * 
 * User APIs:
 * 1. POST /v1/reports - Báo cáo phòng vi phạm
 * 
 * Admin APIs:
 * 2. GET /v1/reports - Danh sách reports
 * 3. GET /v1/reports/{id} - Chi tiết report
 * 4. PUT /v1/reports/{id}/process - Xử lý report
 * 5. GET /v1/reports/room/{roomId} - Reports của 1 phòng
 */
@RestController
@RequestMapping("/v1/reports")
@RequiredArgsConstructor
@Tag(name = "Reports", description = "Report management APIs")
public class ReportController {

    private final ReportService reportService;

    // ========== User APIs ==========

    @PostMapping
    @Operation(summary = "Report a room for violation")
    public ResponseEntity<ApiResponse<ReportResponse>> createReport(
            @Valid @RequestBody CreateReportRequest request) {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // ========== Admin APIs ==========

    @GetMapping
    @Operation(summary = "Get all reports (Admin only)")
    public ResponseEntity<ApiResponse<Page<ReportResponse>>> getAllReports(
            @RequestParam(required = false) String status,
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement - Check admin role
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get report details (Admin only)")
    public ResponseEntity<ApiResponse<ReportResponse>> getReportById(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PutMapping("/{id}/process")
    @Operation(summary = "Process a report (Admin only)")
    public ResponseEntity<ApiResponse<Void>> processReport(
            @PathVariable Long id,
            @RequestParam String action) { // processed, rejected
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/room/{roomId}")
    @Operation(summary = "Get all reports for a room (Admin only)")
    public ResponseEntity<ApiResponse<Page<ReportResponse>>> getReportsByRoom(
            @PathVariable Long roomId,
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
