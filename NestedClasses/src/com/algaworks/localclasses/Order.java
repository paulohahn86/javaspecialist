package com.algaworks.localclasses;

import java.math.BigDecimal;

public class Order {

    private BigDecimal balance;

    public Order(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Transaction paymentConfirmed(BigDecimal value) {
        BigDecimal taxa = value.multiply(new BigDecimal("0.10"));
        balance = balance.subtract(taxa).subtract(value);

        class payment implements Transaction {

            @Override
            public BigDecimal getTotalValue() {
                return value.add(taxa);
            }

            @Override
            public void refund() {
                balance = balance.add(taxa).add(value);
            }

        }

        return new payment();
    }

    public Transaction collectTax(BigDecimal value) {
        balance = balance.subtract(value);

        class Tax implements Transaction {

            @Override
            public BigDecimal getTotalValue() {
                return value;
            }

            @Override
            public void refund() {
                balance = balance.add(value);
            }

        }

        return new Tax();
    }

}
