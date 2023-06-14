package com.algaworks.crm.invoice;

public abstract class Invoice {

    private String description;
    private double totalValue;

    public Invoice(String descricao, double valorTotal){
        this.description = descricao;
        this.totalValue = valorTotal;
    }

    public String getDescription() {
        return description;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public abstract double calculateTaxes();

    public void issue(){
        System.out.printf("Invoice issued for: %s%n", getDescription());
        System.out.printf("Total value: %.2f%n", getTotalValue());
        System.out.printf("Taxes: %.2f%n", calculateTaxes());
    }

}
