package com.algaworks.notstaticnestedclasses;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account {

    private BigDecimal balance;
    private List<Transaction> transactions = new ArrayList<>();


    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }


    public class Transaction {

        private String description;
        private BigDecimal value;

        public Transaction(String description, BigDecimal value) {
            this.description = description;
            this.value = value;

            balance = balance.subtract(value);
            transactions.add(this);
        }

        public String getDescription() {
            return description;
        }

        public BigDecimal getValue() {
            return value;
        }
    }


}
