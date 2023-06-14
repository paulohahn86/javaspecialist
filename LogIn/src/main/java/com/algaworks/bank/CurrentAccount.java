package com.algaworks.bank;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Objects;



public class CurrentAccount {

    private final static Logger logger = LoggerFactory.getLogger(CurrentAccount.class);

    private final Holder holder;
    private final int agency;
    private final int numberAccount;
    private BigDecimal balance = BigDecimal.ZERO;

    public CurrentAccount(Holder holder, int agency, int numberAccount) {
        Objects.requireNonNull(holder);
        Objects.requireNonNull(agency);
        Objects.requireNonNull(numberAccount);
        this.holder = holder;
        this.agency = agency;
        this.numberAccount = numberAccount;
    }

    public Holder getHolder() {
        return holder;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }



    public void deposit(BigDecimal value) {
        logger.debug("Beginning deposit....");
        Objects.requireNonNull(value);
        if(value.compareTo(BigDecimal.ZERO) <= 0){
            throw new GreaterZero("Value greater than Zero");
        }


        balance = balance.add(value);

        logger.info("{} *** R$ {} *** Deposit realized!" , agency + " - " + numberAccount, value);


    }
    public void withDraw(BigDecimal value){
        logger.debug("Beginning withdraw...");
        Objects.requireNonNull(value);

        sufficientBalance(value);

        balance = balance.subtract(value);

        logger.info("{} *** R$ {} *** WithDraw realized!" , agency + " - " + numberAccount, value);
    }

    private void sufficientBalance(BigDecimal value) {
        if(value.compareTo(BigDecimal.ZERO) <= 0){
            throw new GreaterZero("Value greater than Zero");
        }else if (balance.compareTo(value) < 0){
            throw new InsufientBalance("Insufficient balance.");
        }
    }

    public void printStatement(){
        System.out.println();
        System.out.printf("Holder: %s%n", getHolder().getName());
        System.out.printf("ID: %s%n", getHolder().getCpf());
        System.out.printf("Agency: %d%n", getAgency());
        System.out.printf("Account: %d%n", getNumberAccount());
        System.out.println(" --------------------- ");
        System.out.printf("Total Balance: %.2f%n", getBalance());
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "holder=" + holder +
                ", agency=" + agency +
                ", numberAccount=" + numberAccount +
                ", balance=" + String.format("%.2f", balance) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentAccount that = (CurrentAccount) o;
        return agency == that.agency && numberAccount == that.numberAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency, numberAccount);
    }
}
