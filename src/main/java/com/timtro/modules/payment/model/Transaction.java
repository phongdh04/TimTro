package com.timtro.modules.payment.model;

import com.timtro.core.common.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "transactions")
public class Transaction extends BaseEntity {

    @Column(name = "wallet_id", nullable = false)
    private Long walletId;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal amount;

    @Column(nullable = false, length = 20)
    private String type; // deposit, buy_package, push_fee, refund

    @Column(nullable = false, length = 20)
    private String status; // pending, success, failed

    @Column(name = "transfer_content", unique = true, length = 50)
    private String transferContent;

    @Column(name = "gateway_transaction_id", unique = true, length = 100)
    private String gatewayTransactionId;

    @Column(name = "bank_account_info", columnDefinition = "TEXT")
    private String bankAccountInfo;

    @Column(columnDefinition = "TEXT")
    private String description;
}
