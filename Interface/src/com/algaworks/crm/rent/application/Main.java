package com.algaworks.crm.rent.application;

import com.algaworks.crm.rent.model.*;


public class Main {

    public static void main(String[] args) {

        Notebook notebook = new Notebook("MacBook Pro i7 16 gb", 5,20);
        Pricing pricing = new PricingPerDay();
        Insurance insurance = new InsuranceItau();

        Location location = new Location(notebook, pricing,insurance);
        double calculateDueValue = location.calculateDueValue(25);

        System.out.printf("Amount to be paid: R$%.2f%n", calculateDueValue);


    }
}
