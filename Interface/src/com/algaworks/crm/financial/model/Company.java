package com.algaworks.crm.financial.model;

public abstract class Company {

    private String socialReason;
    private double totalBilling;

    public Company(String socialReason, double totalBilling) {
        this.socialReason = socialReason;
        this.totalBilling = totalBilling;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public double getTotalBilling() {
        return totalBilling;
    }

    public void setTotalBilling(double totalBilling) {
        this.totalBilling = totalBilling;
    }


}
