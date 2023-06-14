package com.algaworks.crm.bank.model;

public abstract class BaseAccountDecorator implements Account {

    private Account baseAccount;

    public BaseAccountDecorator(Account baseAccount) {
        this.baseAccount = baseAccount;
    }

    public Account getBaseAccount() {
        return baseAccount;
    }

    @Override
    public double getBalance() {
        return baseAccount.getBalance();
    }

    @Override
    public void withdraw(double value) {
        baseAccount.withdraw(value);
    }

    @Override
    public void deposit(double value) {
        baseAccount.deposit(value);
    }

    @Override
    public void transfer(Account account, double value) {
        baseAccount.transfer(account, value);
    }

    @Override
    public void investIn(double value) {
        baseAccount.investIn(value);
    }
}
