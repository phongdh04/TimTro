package com.timtro.modules.payment.service;

import com.timtro.modules.payment.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service interface for ServicePackage (gói dịch vụ) operations.
 * Follows Interface Segregation Principle.
 * 
 * Chức năng chính:
 * 1. Lấy danh sách gói dịch vụ
 * 2. Mua gói cho phòng
 * 3. Lấy gói đang active của phòng
 * 4. Lấy lịch sử mua gói
 * 5. Gia hạn gói
 * 6. Hủy gói
 */
public interface PackageService {

    /** Lấy danh sách tất cả gói dịch vụ */
    List<ServicePackageResponse> getAllPackages();

    /** Lấy chi tiết 1 gói */
    ServicePackageResponse getPackageById(Integer packageId);

    /** Mua gói cho phòng */
    PurchasePackageResponse purchasePackage(PurchasePackageRequest request, Long userId);

    /** Lấy gói đang active của phòng */
    RoomPackageHistory getActivePackage(Long roomId);

    /** Lấy lịch sử mua gói của 1 phòng */
    Page<RoomPackageHistory> getPackageHistoryByRoom(Long roomId, Pageable pageable);

    /** Lấy tất cả gói đang active của landlord */
    Page<RoomPackageHistory> getActivePackagesByLandlord(Long userId, Pageable pageable);

    /** Gia hạn gói */
    PurchasePackageResponse renewPackage(Long roomId, Integer durationDays, Long userId);

    /** Hủy gói (nếu cho phép) */
    void cancelPackage(Long roomId, Long userId);

    /** Kiểm tra phòng có gói active không */
    boolean hasActivePackage(Long roomId);
}
