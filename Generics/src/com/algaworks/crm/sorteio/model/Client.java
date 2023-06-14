package com.algaworks.crm.sorteio.model;

public class Client implements Nameable {


    private String name;
    private double monthlyBilling;

    public Client(String socialReason, double monthlyBilling) {
        this.name = socialReason;
        this.monthlyBilling = monthlyBilling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyBilling() {
        return monthlyBilling;
    }

    public void setMonthlyBilling(double monthlyBilling) {
        this.monthlyBilling = monthlyBilling;
    }


    public String getSearch() {
        return getName();
    }
}
