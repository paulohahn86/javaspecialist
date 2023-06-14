package com.algaworks.commercial;

import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();


        sales.stream()
                .filter(Sale::isClosed)
                .flatMap(venda -> venda.getItems().stream())
                .map(Sale.Item::description)
                .distinct()
                .sorted(String::compareTo)
                .forEach(System.out::println);


    }
}
