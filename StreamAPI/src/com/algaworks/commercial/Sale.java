package com.algaworks.commercial;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Sale {


    private final Integer id;
    private final LocalDate date = LocalDate.now();
    private BigDecimal totalValue = BigDecimal.ZERO;
    private final Client client;
    private final List<Item> items = new ArrayList<>();
    private Status status = Status.DRAFT;

    public Sale(Integer id, Client client) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(client);
        this.id = id;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public Client getCliente() {
        return client;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public Status getStatus() {
        return status;
    }

    public boolean isClosed(){
        return Status.CLOSED.equals(status);
    }

    public boolean isCanceled(){
        return Status.CANCELED.equals(status);
    }

    public boolean isDraft(){
        return Status.DRAFT.equals(status);
    }

    public void addItem(Item item){
        items.add(item);
        calculateTotalValue();
    }

    public void close(){
        status = Status.CLOSED;
    }

    public void cancel(){
        status = Status.CANCELED;
    }

    private void calculateTotalValue(){
        totalValue = items.stream()
                .map(Item::calculateTotalValue)
                .reduce(BigDecimal.ZERO,BigDecimal::add);
    }


    public enum Status{
        DRAFT, CLOSED, CANCELED;
    }

    public static record Item(String description, int quantity, BigDecimal unitPrice){
        public BigDecimal calculateTotalValue(){
            return unitPrice.multiply(new BigDecimal(quantity));
        }
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", date=" + date +
                ", totalValue=" + totalValue +
                ", client=" + client +
                ", items=" + items +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return Objects.equals(id, sale.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
