package com.algaworks.sealedClass;

import com.algaworks.sealedClass.entity.Product;
import com.algaworks.sealedClass.service.CsvGenerator;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        var produtos = Arrays.asList(new Product(1L, "Macbook Pro", new BigDecimal("19500"), 25),
                new Product(2L, "iPhone", new BigDecimal("12300"), 7),
                new Product(4L, "Monitor", new BigDecimal("1800"), 18));

       CsvGenerator.print(Product.class,produtos);

    }
}
