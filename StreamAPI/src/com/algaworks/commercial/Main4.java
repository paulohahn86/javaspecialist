package com.algaworks.commercial;

import java.math.BigDecimal;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

        var serviceSale = new ServiceSale();
        List<Sale> sales = serviceSale.getAll();

       BigDecimal totalSales = sales.stream()
                .filter(Sale::isClosed)
                .map(Sale::getTotalValue)
                .reduce(BigDecimal.ZERO,BigDecimal::add);

        System.out.println(String.format("R$ %.2f",totalSales));

    }
}
