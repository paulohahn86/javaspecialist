package com.algaworks.crm.auditoria;

public class TaxManager {

    private double valueTotalTaxes;

    public double getValueTotalTaxes() {
        return valueTotalTaxes;
    }

    public void add(Person person){
        var totalTax = person.CalculateTax();
        System.out.printf("Taxes due from %s: R$ %.2f%n", person.getName(), totalTax);
        this.valueTotalTaxes += totalTax;
    }

}
