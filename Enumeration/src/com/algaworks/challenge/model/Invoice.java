package com.algaworks.challenge.model;

public class Invoice {

    private final Integer number;
    private final String description;
    private final double value;
    private StatusInvoice status = StatusInvoice.NOT_ISSUED;

    public Invoice(Integer number, String description, double value) {
        this.number = number;
        this.description = description;
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }
    public StatusInvoice getStatus() {
        return status;
    }

    public void cancel() {

        if (cancelConfirmed()){
            status = StatusInvoice.CANCELED;
        }else {
            throw new IllegalStateException("Unable to cancel invoice");
        }
    }

    public void issue() {
        if(orderConfirmed()){
            status = StatusInvoice.ISSUED;
        }else {
            throw new IllegalStateException("Unable to issue invoice");
        }
    }

    public String getFullDescription() {
        return String.format("Invoice #%d (%s) in the amount to R$%.2f is %s",
                getNumber(), getDescription(), getValue(), getStatus());
    }


    private boolean orderConfirmed(){
        if(StatusInvoice.NOT_ISSUED.equals(this.status)){
            return true;
        }
        return false;
    }

    private boolean cancelConfirmed(){
        if(StatusInvoice.ISSUED.equals(this.getStatus()) && getValue() >= 1000
        || StatusInvoice.CANCELED.equals(this.getStatus())){
           return false;
        }
        return true;
    }

}
