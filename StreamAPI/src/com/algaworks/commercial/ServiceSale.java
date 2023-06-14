package com.algaworks.commercial;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServiceSale {

    private final List<Sale> sales = new ArrayList<>();


    public ServiceSale(){

        var sale1 = new Sale(generateNextCode(), new Client("João da Silva"));
        sale1.addItem(new Sale.Item("Ar condicionado", 2, new BigDecimal("3400.5")));
        sale1.addItem(new Sale.Item("Ventilador", 5, new BigDecimal("289")));
        sales.add(sale1);

        var sale2 = new Sale(generateNextCode(), new Client("Maria de Souza"));
        sale2.addItem(new Sale.Item("Ar condicionado", 1, new BigDecimal("3340")));
        sale2.addItem(new Sale.Item("Máquina de lavar", 10, new BigDecimal("2400")));
        sale2.addItem(new Sale.Item("Panela de pressão", 3, new BigDecimal("146.2")));
        sales.add(sale2);

        var sale3 = new Sale(generateNextCode(), new Client("José Aparecida"));
        sale3.addItem(new Sale.Item("Frigideira", 4, new BigDecimal("98")));
        sale3.addItem(new Sale.Item("Panela de pressão", 12, new BigDecimal("142")));
        sales.add(sale3);

        var sale4 = new Sale(generateNextCode(), new Client("Sebastião Pereira"));
        sale4.addItem(new Sale.Item("Purificador de água", 8, new BigDecimal("1223")));
        sale4.addItem(new Sale.Item("Panela de pressão", 6, new BigDecimal("146.2")));
        sale4.addItem(new Sale.Item("Ventilador", 1, new BigDecimal("301.2")));
        sales.add(sale4);

        var sale5 = new Sale(generateNextCode(), new Client("João da Silva"));
        sale5.addItem(new Sale.Item("Purificador de água", 8, new BigDecimal("1223")));
        sale5.addItem(new Sale.Item("Ventilador", 7, new BigDecimal("280")));
        sales.add(sale5);

        sale1.close();
        sale2.cancel();
        sale3.close();
        sale5.close();

    }

        private Integer generateNextCode(){
            return sales.stream()
                    .mapToInt(Sale::getId)
                    .max()
                    .orElse(0);
        }

        public List<Sale> getAll(){
            return Collections.unmodifiableList(sales);
        }

}
