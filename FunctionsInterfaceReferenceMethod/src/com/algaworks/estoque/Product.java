package com.algaworks.estoque;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    public Product(String s) {
    }

    public enum Status{
        ACTIVE, INACTIVE
    }

    private String name;
    private BigDecimal value;
    private int quantity;
    private Status status = Status.ACTIVE;


    public Product(String name, BigDecimal value, int quantity) {
        this.name = name;
        this.value = value;
        this.quantity = quantity;
    }

    public Product(String name, BigDecimal value, int quantity, Status status) {
        this(name,value,quantity);
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inactivate(){
        status = Status.INACTIVE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product produto = (Product) o;
        return name.equals(produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                ", status=" + status +
                '}';
    }
}
