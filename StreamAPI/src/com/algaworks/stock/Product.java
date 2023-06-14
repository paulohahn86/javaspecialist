package com.algaworks.stock;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {



    public enum Status{
        ACTIVATE, INACTIVATE
    }


    private String name;
    private BigDecimal price;
    private int quantity;
    private Status status = Status.ACTIVATE;
    private final Manufacturer manufacturer;
    private final Set<Category> categories = new HashSet<>();

    public Product(String name, BigDecimal price, int quantity, Manufacturer manufacturer,
                   Category... categories) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.categories.addAll(Set.of(categories));
    }

    public Product(String name, BigDecimal price, int quantity, Manufacturer manufacturer, Status status,
                   Category...categories) {

        this(name,price,quantity,manufacturer,categories);
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Set<Category> getCategories() {
        return categories;
    }


    public void inactivate(){
        this.status = Status.INACTIVATE;
    }

    public void activate(){
        this.status = Status.ACTIVATE;
    }

    public boolean isActivate(){
       return Status.ACTIVATE.equals(status);
    }

    public boolean isInactivate(){
        return Status.INACTIVATE.equals(status);
    }

    public void addCategory(Category category){
        this.categories.add(category);
    }

    public void deleteCategory(Category category){
        this.categories.remove(category);
    }

    public boolean hasStock(){
        return getQuantity() > 0;
    }

    public BigDecimal getStockValue(){
        return getPrice().multiply(new BigDecimal(getQuantity()));
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", status=" + status +
                ", manufacturer=" + manufacturer +
                ", categories=" + categories +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product produto = (Product) o;
        return Objects.equals(name, produto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
