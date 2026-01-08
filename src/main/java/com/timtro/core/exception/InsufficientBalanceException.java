package com.timtro.core.exception;

/**
 * Exception for insufficient balance in wallet.
 */
public class InsufficientBalanceException extends BusinessException {

    public InsufficientBalanceException() {
        super("Số dư trong ví không đủ để thực hiện giao dịch này");
    }

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
