package com.algaworks.commercial;

import java.util.List;

public class Main1 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();

        sales.stream()
                .filter(Sale::isClosed)
                .forEach(System.out::println);

    }
}
