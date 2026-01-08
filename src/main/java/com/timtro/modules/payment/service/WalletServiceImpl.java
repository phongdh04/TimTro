package com.timtro.modules.payment.service;

import com.timtro.modules.payment.dto.*;
import com.timtro.modules.payment.repository.TransactionRepository;
import com.timtro.modules.payment.repository.WalletRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Slf4j
@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {

    private final WalletRepository walletRepository;
    private final TransactionRepository transactionRepository;

    @Override
    @Transactional(readOnly = true)
    public WalletResponse getWallet(Long userId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public WalletResponse createWallet(Long userId) {
        // TODO: Implement
        // Tạo ví với balance = 0
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public TransactionResponse deposit(Long userId, DepositRequest request) {
        // TODO: Implement
        // 1. Validate transfer content (unique)
        // 2. Create transaction (pending)
        // 3. Verify with payment gateway (hoặc manual)
        // 4. Update wallet balance
        // 5. Update transaction status
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public TransactionResponse deduct(Long userId, BigDecimal amount, String type, String description) {
        // TODO: Implement
        // 1. Check balance
        // 2. Deduct from wallet (with optimistic locking)
        // 3. Create transaction record
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional
    public TransactionResponse withdraw(Long userId, WithdrawRequest request) {
        // TODO: Implement
        // 1. Validate balance
        // 2. Create pending transaction
        // 3. Deduct from wallet
        // 4. Process withdrawal (hoặc đánh dấu để admin xử lý)
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<TransactionResponse> getTransactionHistory(Long userId, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public Page<TransactionResponse> getTransactionsByType(Long userId, String type, Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public TransactionResponse getTransactionById(Long transactionId, Long userId) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public PaymentStatistics getPaymentStatistics(Long userId) {
        // TODO: Implement
        // Aggregate data từ transactions
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    @Transactional(readOnly = true)
    public boolean hasEnoughBalance(Long userId, BigDecimal amount) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
