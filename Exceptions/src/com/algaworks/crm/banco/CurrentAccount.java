package com.algaworks.crm.banco;

import com.algaworks.crm.banco.exception.InactiveAccountException;
import com.algaworks.crm.banco.exception.InsufficentBalanceException;

import java.util.Objects;

public class CurrentAccount {

    private String name;
    private double balance;
    private boolean status = false;

    public CurrentAccount(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double value)  {
        if(isInactive()){
            throw new InactiveAccountException("Inactive account");
        }
        if(value <= 0){
            throw new IllegalArgumentException("Value must to be greater than 0");
        }
        if(this.getBalance() < value){
            throw new InsufficentBalanceException("Insufficient balance");
        }

        this.balance -= value;
    }

    public void deposit(double value) {
        if(isInactive()){
            throw new InactiveAccountException("Inactive account");
        }
        if(value <= 0){
            throw new IllegalArgumentException("Value must to be greater than 0");
        }

        this.balance += value;
    }



    public void transfer(CurrentAccount targetAccount, double value) {
        Objects.requireNonNull(targetAccount);

        if(targetAccount.isInactive()){
            throw new InactiveAccountException("Target account is inactive");
        }

        withdraw(value);
        targetAccount.deposit(value);
    }

    public void activate(){
        this.status = true;
    }

    public boolean isInactive(){
        if(!status){
            return true;
        }
        return false;
    }

}
