package com.algaworks.commercial;

import java.util.List;

public class Main5 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();

        int totalItem = sales.stream()
                .filter(Sale::isClosed)
                .flatMap(sale -> sale.getItems().stream())
                .mapToInt(Sale.Item::quantity)
                .sum();
        System.out.println(totalItem);

    }
}
