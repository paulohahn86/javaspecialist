package com.algaworks.crm.auditoria;

public abstract class JuridicalPerson extends Person {

    private final double annualIncome;
    private final double annualExpenditure;

    public JuridicalPerson(String name, double annualIncome, double annualExpenditure) {
        super(name);
        this.annualIncome = annualIncome;
        this.annualExpenditure = annualExpenditure;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public double getAnnualExpenditure() {
        return annualExpenditure;
    }

    public double getAnnualProfit(){
        return this.getAnnualIncome() - this.getAnnualExpenditure();
    }
}
