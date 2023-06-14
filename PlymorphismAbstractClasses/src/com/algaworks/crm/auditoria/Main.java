package com.algaworks.crm.auditoria;

public class Main {

    public static void main(String[] args) {

        var taxManager = new TaxManager();

        var joao = new PhysicalPerson("João da Silva", 45000);
        var maria = new PhysicalPerson("Maria da Silva", 180000);

        var barDoze = new SimpleCompany("Bar do Zé", 250000, 160000);
        var codeConsultoria = new RealProfitCompany("Code Consultoria", 8000000, 6000000);

        taxManager.add(joao);
        taxManager.add(maria);
        taxManager.add(barDoze);
        taxManager.add(codeConsultoria);

        System.out.printf("Total taxes %.2f%n", taxManager.getValueTotalTaxes());

    }
}
