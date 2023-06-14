package com.algaworks.crm.bank.model;

public class TaxableAccount extends BaseAccountDecorator {
    public static final double MOVING_TAX_RATE = 0.1;
    public TaxableAccount(Account baseAccount) {
        super(baseAccount);
    }



    @Override
    public void withdraw(double value) {
        getBaseAccount().withdraw(value);
        debitTransactionTax(value);
    }
    @Override
    public void transfer(Account account, double value) {
        getBaseAccount().transfer(account, value);
        debitTransactionTax(value);
    }

    @Override
    public void investIn(double value) {
        getBaseAccount().investIn(value);
        debitTransactionTax(value);
    }

    private void debitTransactionTax(double transactionValue) {
        getBaseAccount().withdraw(transactionValue * MOVING_TAX_RATE);
    }
}
