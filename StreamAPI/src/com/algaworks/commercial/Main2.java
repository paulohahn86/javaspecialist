package com.algaworks.commercial;

import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();

        sales.stream()
                .filter(Sale::isClosed)
                .map(Sale::getCliente)
                .distinct()
                .sorted(Comparator.comparing(Client::name))
                .forEach(System.out::println);

    }
}
