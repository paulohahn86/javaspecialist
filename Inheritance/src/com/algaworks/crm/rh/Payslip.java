package com.algaworks.crm.rh;

public record Payslip(String name, String monthYear, double salaryValue) {

    public void print(){
        System.out.println();
        System.out.printf("Payslip of %s%n", name);
        System.out.printf("Month/Years: %s%n", monthYear);
        System.out.printf("salary receivable: %.2f%n ", salaryValue);
    }


}
