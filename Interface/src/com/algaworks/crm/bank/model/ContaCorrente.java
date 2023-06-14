package com.algaworks.crm.bank.model;

public class ContaCorrente implements Account {

    private double balance;


    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double value) {
        this.balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance += value;
    }

    @Override
    public void transfer(Account account, double value) {
        withdraw(value);
        account.deposit(value);
    }

    @Override
    public void investIn(double value) {
        this.balance -= value;
    }


}
