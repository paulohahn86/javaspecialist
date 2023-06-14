package com.algaworks.crm.accountspayable.model;

import com.algaworks.crm.accountspayable.PayableDocument;

public class ServiceOrder implements PayableDocument {

    private double totalValue;
    private Beneficiary beneficiary;

    public ServiceOrder(double totalValue, Beneficiary beneficiary) {
        this.totalValue = totalValue;
        this.beneficiary = beneficiary;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Beneficiary getEmployer() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }



}
