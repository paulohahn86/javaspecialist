package com.algaworks.crm.rh;

public class Main {

    public static void main(String[] args) {

        employer employer = new employer("Paulo", 13.5);
        System.out.println(employer.toString());
        Payslip payslip = employer.getPayslip(40,"4/2023");
        payslip.print();

        System.out.println();

        Programming jose = new Programming("Jose",10);
        jose.setExtraValue(100);
        System.out.println(jose.toString());
        payslip = jose.getPayslip(20,"5/2023");
        payslip.print();



    }
}
