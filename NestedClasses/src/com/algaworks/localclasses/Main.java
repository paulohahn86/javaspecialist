package com.algaworks.localclasses;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Order order = new Order(new BigDecimal("1000"));
        System.out.printf("Init balance: R$%s%n", order.getBalance());

        Transaction transaction1 = order.paymentConfirmed(new BigDecimal("100"));
        Transaction transaction2 = order.collectTax(new BigDecimal("20"));

        System.out.printf("Transaction 1: R$%s%n", transaction1.getTotalValue());
        System.out.printf("Transaction 2: R$%s%n", transaction2.getTotalValue());
        System.out.printf("Total balance: R$%s%n", order.getBalance());

        transaction1.refund();
        System.out.printf("Balance after refund: R$%s%n", order.getBalance());
    }

}
