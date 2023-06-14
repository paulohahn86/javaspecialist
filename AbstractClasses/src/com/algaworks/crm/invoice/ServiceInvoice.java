package com.algaworks.crm.invoice;

public class ServiceInvoice extends Invoice {

    public static final int MAXIMUM_TAX_EXEMPTION_AMOUNT = 1000;
    public static final double TAX_RATES = 0.18;
    private boolean intercity;

    public ServiceInvoice(String description, double totalValue, boolean intercity) {
        super(description, totalValue);
        this.intercity = intercity;
    }

    public boolean isIntercity() {
        return intercity;
    }

    @Override
    public double calculateTaxes(){
        if(isTaxExempt()){
            return 0;
        }

        return getTotalValue() * TAX_RATES;
    }

    private boolean isTaxExempt() {
        return isIntercity() && getTotalValue() <= MAXIMUM_TAX_EXEMPTION_AMOUNT;
    }


}
