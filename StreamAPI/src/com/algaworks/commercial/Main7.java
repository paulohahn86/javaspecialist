package com.algaworks.commercial;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main7 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();



//        Map<String, Long> vendasRealizadasPorCliente = sales.stream()
//                .filter(Venda::isFechada)
//                .collect(Collectors.groupingBy(venda -> venda.getCliente().name(),
//                        Collectors.counting()));
//
//        vendasRealizadasPorCliente.forEach((name, quantity) -> {
//            System.out.printf("Nome %s -> %d%n", name,quantity);
//        });

        Map<String, BigDecimal> vendasRealizadasPorCliente = sales.stream()
                .filter(Sale::isClosed)
                .collect(Collectors.groupingBy(venda -> venda.getCliente().name(),
                        Collectors.mapping(Sale::getTotalValue,
                                Collectors.reducing(BigDecimal.ZERO,BigDecimal::add))));

        vendasRealizadasPorCliente.forEach((nome, valorTotal) -> {
            System.out.printf("Nome %s -> R$ %.2f%n", nome,valorTotal);
        });

//        BigDecimal totalVendas = sales.stream()
//                .filter(Venda::isFechada)
//                .map(Venda::getValorTotal)
//                .reduce(BigDecimal.ZERO,BigDecimal::add);
//
//        System.out.println(String.format("R$ %.2f",totalVendas));

    }
}
