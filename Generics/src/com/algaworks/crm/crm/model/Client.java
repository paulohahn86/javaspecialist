package com.algaworks.crm.crm.model;

public class Client {

    private String socialReason;
    private double monthlyBilling;

    public Client(String socialReason, double monthlyBilling) {
        this.socialReason = socialReason;
        this.monthlyBilling = monthlyBilling;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public double getMonthlyBilling() {
        return monthlyBilling;
    }

    public void setMonthlyBilling(double monthlyBilling) {
        this.monthlyBilling = monthlyBilling;
    }
}
