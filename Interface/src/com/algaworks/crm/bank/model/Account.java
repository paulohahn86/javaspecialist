package com.algaworks.crm.bank.model;

public interface Account {

    double getBalance();
    void withdraw(double value);
    void deposit(double value);
    void transfer(Account account, double value);

    void investIn(double value);
}
