package com.algaworks.challenge.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Order {

    private final Client client;
    private StatusPedido status = StatusPedido.DRAFT;
    static BigDecimal totalValue = BigDecimal.ZERO;
    private final List<orderItem> items = new ArrayList<>();

    public enum StatusPedido{
        DRAFT, ISSUED, CANCELED
    }

    public Order(Client client) {
        Objects.requireNonNull(client);
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<orderItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public orderItem addItem(String description, int quantity, BigDecimal unitValue) {
        orderItem item = new orderItem(description, quantity, unitValue, this);
        items.add(item);
        return item;
    }

    public void issue() {
        checkRequestoModification();
        status = StatusPedido.ISSUED;
    }

    public void cancel() {
        checkRequestoModification();
        status = StatusPedido.CANCELED;
    }

    private void checkRequestoModification() {
        if (!StatusPedido.DRAFT.equals(status)) {
            throw new IllegalArgumentException("Order cannot be changed");
        }
    }
    public class orderItem {

        private final String description;
        private final BigDecimal unitValue;
        private int quantity;

        orderItem(String description, int quantity, BigDecimal unitValue, Order order) {
            Objects.requireNonNull(description);
            Objects.requireNonNull(unitValue);

            if (unitValue.compareTo(BigDecimal.ZERO) < 1) {
                throw new IllegalArgumentException("Unit value must be greater than zero");
            }

            this.description = description;
            this.unitValue = unitValue;
            setQuantity(quantity);
        }

        public String getDescription() {
            return description;
        }

        public BigDecimal getUnitValue() {
            return unitValue;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            checkRequestoModification();

            if (quantity < 1) {
                throw new IllegalArgumentException("Qunatity must be greater than zero");
            }

            totalValue = totalValue.subtract(calculateTotalValue(this.quantity));
            this.quantity = quantity;
            totalValue = totalValue.add(calculateTotalValue(quantity));
        }

        public BigDecimal getValorTotal() {
            return calculateTotalValue(this.quantity);
        }

        private BigDecimal calculateTotalValue(int quantity) {
            return unitValue.multiply(new BigDecimal(quantity));
        }

    }


}