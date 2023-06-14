package com.algaworks.crm.banco.exception;

public class InactiveAccountException extends BankingOperationException {

    public InactiveAccountException(String message) {
        super(message);
    }

    public InactiveAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}
