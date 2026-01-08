package com.timtro.modules.payment.service;

import com.timtro.modules.payment.dto.*;
import com.timtro.modules.payment.repository.TransactionRepository;
import com.timtro.modules.payment.repository.WalletRepository;
import com.timtro.modules.listing.repository.RoomRepository;
import com.timtro.modules.listing.repository.ServicePackageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PackageServiceImpl implements PackageService {

    private final ServicePackageRepository packageRepository;
    private final RoomRepository roomRepository;
    private final WalletService walletService;
    private final TransactionRepository transactionRepository;
    private final WalletRepository walletRepository;

    @Override
    @Transactional(readOnly = true)
    public List<ServicePackageResponse> getAllPackages() {
        // TODO: Implement
        // Chỉ lấy các package đang active
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public ServicePackageResponse getPackageById(Integer packageId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public PurchasePackageResponse purchasePackage(PurchasePackageRequest request, Long userId) {
        // TODO: Implement
        // 1. Validate room belongs to user
        // 2. Check if room already has active package
        // 3. Calculate price = pricePerDay * durationDays
        // 4. Check wallet balance
        // 5. Deduct from wallet
        // 6. Update room's package info
        // 7. Create transaction record
        // 8. Return response
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public RoomPackageHistory getActivePackage(Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<RoomPackageHistory> getPackageHistoryByRoom(Long roomId, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<RoomPackageHistory> getActivePackagesByLandlord(Long userId, Pageable pageable) {
        // TODO: Implement
        // Lấy tất cả phòng của landlord đang có gói active
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public PurchasePackageResponse renewPackage(Long roomId, Integer durationDays, Long userId) {
        // TODO: Implement
        // Gia hạn gói hiện tại thêm durationDays
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public void cancelPackage(Long roomId, Long userId) {
        // TODO: Implement
        // Hủy gói và có thể refund (nếu policy cho phép)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public boolean hasActivePackage(Long roomId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
