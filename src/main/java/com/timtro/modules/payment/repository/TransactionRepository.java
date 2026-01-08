package com.timtro.modules.payment.repository;

import com.timtro.modules.payment.model.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Page<Transaction> findByWalletIdOrderByCreatedAtDesc(Long walletId, Pageable pageable);

    Optional<Transaction> findByTransferContent(String transferContent);

    Optional<Transaction> findByGatewayTransactionId(String gatewayTransactionId);
}
