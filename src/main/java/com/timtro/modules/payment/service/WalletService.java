package com.timtro.modules.payment.service;

import com.timtro.modules.payment.dto.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;

/**
 * Service interface for Wallet operations.
 * Follows Interface Segregation Principle.
 * 
 * Chức năng chính:
 * 1. Lấy thông tin ví
 * 2. Tạo ví mới (khi user đăng ký)
 * 3. Nạp tiền
 * 4. Trừ tiền
 * 5. Rút tiền
 * 6. Lịch sử giao dịch
 * 7. Thống kê thanh toán
 */
public interface WalletService {

    /** Lấy thông tin ví của user */
    WalletResponse getWallet(Long userId);

    /** Tạo ví mới cho user */
    WalletResponse createWallet(Long userId);

    /** Nạp tiền vào ví */
    TransactionResponse deposit(Long userId, DepositRequest request);

    /** Trừ tiền từ ví (internal use) */
    TransactionResponse deduct(Long userId, BigDecimal amount, String type, String description);

    /** Rút tiền từ ví */
    TransactionResponse withdraw(Long userId, WithdrawRequest request);

    /** Lấy lịch sử giao dịch */
    Page<TransactionResponse> getTransactionHistory(Long userId, Pageable pageable);

    /** Lấy lịch sử giao dịch theo loại */
    Page<TransactionResponse> getTransactionsByType(Long userId, String type, Pageable pageable);

    /** Lấy chi tiết 1 giao dịch */
    TransactionResponse getTransactionById(Long transactionId, Long userId);

    /** Lấy thống kê thanh toán */
    PaymentStatistics getPaymentStatistics(Long userId);

    /** Kiểm tra số dư đủ để thanh toán */
    boolean hasEnoughBalance(Long userId, BigDecimal amount);
}
