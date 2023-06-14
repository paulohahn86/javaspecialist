package com.algaworks.notstaticnestedclasses;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(new BigDecimal("1000"));
        System.out.println(account.getBalance());

        Account.Transaction transaction1 = account.new Transaction("" +
                "compra no mercado", new BigDecimal("190.8"));

        Account.Transaction transaction2 = account.new Transaction("" +
                "compra no shopping", new BigDecimal("100.0"));

        System.out.println(account.getBalance());

        for (Account.Transaction transaction : account.getTransactions()) {
            System.out.printf("%s = %s%n,", transaction.getDescription(), transaction.getValue());
        }

    }
}
