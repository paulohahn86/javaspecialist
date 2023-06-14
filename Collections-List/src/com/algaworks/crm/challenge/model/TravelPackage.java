package com.algaworks.crm.challenge.model;

import java.util.Objects;

public class TravelPackage implements Comparable<TravelPackage> {
    private String description;
    private double clientPrice;

    public TravelPackage(){

    }

    public TravelPackage(String description, double clientPrice) {
        Objects.requireNonNull(description);

        if (clientPrice < 0) {
            throw new IllegalArgumentException("Price per person can't be negative");
        }

        this.description = description;
        this.clientPrice = clientPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getClientPrice() {
        return clientPrice;
    }

    public void setClientPrice(double clientPrice) {
        this.clientPrice = clientPrice;
    }

    @Override
    public String toString() {
        return "TravelPackage{" +
                "description='" + description + '\'' +
                ", clientPrice=" + clientPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelPackage that = (TravelPackage) o;
        return Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public int compareTo(TravelPackage o) {
        return getDescription().compareTo(o.getDescription());
    }

}
