package com.algaworks.crm.banco.exception;

public class InsufficentBalanceException extends BankingOperationException {

    public InsufficentBalanceException(String message) {
        super(message);
    }

    public InsufficentBalanceException(String message, Throwable cause) {
        super(message, cause);
    }
}
