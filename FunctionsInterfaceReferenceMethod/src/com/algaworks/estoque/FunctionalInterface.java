package com.algaworks.estoque;

import java.math.BigDecimal;

@java.lang.FunctionalInterface
public interface FunctionalInterface {

    Product getProduct(String name, BigDecimal value, int quantity, Product.Status status);
}
