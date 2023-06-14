package com.algaworks.commercial;

import java.util.List;

public class Main6 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();

//       List<String> clientes = sales.stream()
//                .filter(Venda::isFechada)
//                .map(Venda::getCliente)
//                .map(Cliente::name)
//                .distinct()
//                .sorted()
//                .toList();

        sales.stream()
                .filter(Sale::isClosed)
                .map(Sale::getCliente)
                .map(Client::name)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
