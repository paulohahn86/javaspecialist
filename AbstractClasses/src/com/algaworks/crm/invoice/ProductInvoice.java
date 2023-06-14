package com.algaworks.crm.invoice;

public class ProductInvoice extends Invoice {

    public static final double FEDERAL_TAX_RATE = 0.18;
    public static final double STATE_TAX_RATE = 0.12;



    public ProductInvoice(String description, double totalValue) {
        super(description, totalValue);

    }

    @Override
    public double calculateTaxes(){
        double taxValue = getTotalValue() * FEDERAL_TAX_RATE;
        taxValue += getTotalValue() * STATE_TAX_RATE;
        return taxValue;
    }

}
