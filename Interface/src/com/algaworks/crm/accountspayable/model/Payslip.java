package com.algaworks.crm.accountspayable.model;

import com.algaworks.crm.accountspayable.PayableDocument;

public class Payslip implements PayableDocument {

    private double hourValue;
    private int hourQuantity;
    private Beneficiary employer;

    public Payslip(Beneficiary employer, double hourValue, int hourQuantity) {
        this.hourValue = hourValue;
        this.hourQuantity = hourQuantity;
        this.employer = employer;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public int getHourQuantity() {
        return hourQuantity;
    }

    public void setHourQuantity(int hourQuantity) {
        this.hourQuantity = hourQuantity;
    }

    @Override
    public double getTotalValue() {
        return getHourValue() * getHourQuantity();
    }

    @Override
    public Beneficiary getEmployer() {
        return employer;
    }

    public void setEmployer(Beneficiary employer) {
        this.employer = employer;
    }
}
