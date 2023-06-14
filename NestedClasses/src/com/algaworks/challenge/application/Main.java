package com.algaworks.challenge.application;

import com.algaworks.challenge.model.Client;
import com.algaworks.challenge.model.Order;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    private final static NumberFormat CURRENCY_INSTANCE = NumberFormat.getCurrencyInstance(
            new Locale("pt", "BR"));

    public static void main(String[] args) {
        Client client = new Client("João");
        Order order = new Order(client);

        Order.orderItem item1 = order.addItem("iPhone 14", 3, new BigDecimal("12000"));
        Order.orderItem item2 = order.addItem("Apple Watch", 3, new BigDecimal("5900"));

        resumePrint(order);

        System.out.println("---");

        item1.setQuantity(10);
        resumePrint(order);

        order.issue();
        item1.setQuantity(20); // Não pode alterar order após ser emitido
    }

    private static void resumePrint(Order order) {
        for (Order.orderItem item : order.getItems()) {
            System.out.printf("%dx %s (%s) = %s%n",
                    item.getQuantity(), item.getDescription(),
                    CURRENCY_INSTANCE.format(item.getUnitValue()),
                    CURRENCY_INSTANCE.format(item.getValorTotal()));
        }

        System.out.printf("Total: %s%n", CURRENCY_INSTANCE.format(order.getTotalValue()));
    }

}
