package com.algaworks.crm.financeiro;

public class AccountPayable {


    private String description;
    private double value;
    private String dueDate;
    private boolean paid;

    Supplier supplier;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public boolean isPaid() {
        return paid;
    }

    public void pay(){
        if(isPaid()){
            throw new IllegalArgumentException("Account already paid!");
        }
        this.paid = true;
    }

    public void cancelPayment(){
        if(!isPaid()){
            throw new IllegalArgumentException("Account cannot be canceled because it was not paid!");
        }
        this.paid = false;
    }



}
