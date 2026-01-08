package com.timtro.modules.payment.web;

import com.timtro.core.common.ApiResponse;
import com.timtro.modules.payment.dto.*;
import com.timtro.modules.payment.service.WalletService;
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
 * REST Controller for Wallet operations.
 * 
 * API Endpoints:
 * 1. GET /v1/wallet - Lấy thông tin ví
 * 2. POST /v1/wallet/deposit - Nạp tiền
 * 3. POST /v1/wallet/withdraw - Rút tiền
 * 4. GET /v1/wallet/transactions - Lịch sử giao dịch
 * 5. GET /v1/wallet/transactions/{id} - Chi tiết giao dịch
 * 6. GET /v1/wallet/statistics - Thống kê thanh toán
 */
@RestController
@RequestMapping("/v1/wallet")
@RequiredArgsConstructor
@Tag(name = "Wallet", description = "Wallet management APIs")
public class WalletController {

    private final WalletService walletService;

    @GetMapping
    @Operation(summary = "Get current user's wallet info")
    public ResponseEntity<ApiResponse<WalletResponse>> getWallet() {
        // TODO: Implement - Get userId from SecurityContext
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/deposit")
    @Operation(summary = "Deposit money to wallet")
    public ResponseEntity<ApiResponse<TransactionResponse>> deposit(
            @Valid @RequestBody DepositRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @PostMapping("/withdraw")
    @Operation(summary = "Withdraw money from wallet")
    public ResponseEntity<ApiResponse<TransactionResponse>> withdraw(
            @Valid @RequestBody WithdrawRequest request) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/transactions")
    @Operation(summary = "Get transaction history")
    public ResponseEntity<ApiResponse<Page<TransactionResponse>>> getTransactions(
            @RequestParam(required = false) String type,
            @PageableDefault(size = 20) Pageable pageable) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/transactions/{id}")
    @Operation(summary = "Get transaction details")
    public ResponseEntity<ApiResponse<TransactionResponse>> getTransactionById(@PathVariable Long id) {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @GetMapping("/statistics")
    @Operation(summary = "Get payment statistics")
    public ResponseEntity<ApiResponse<PaymentStatistics>> getStatistics() {
        // TODO: Implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
