package com.algaworks.crm.insurancecompany.service;

import com.algaworks.crm.insurancecompany.model.Secure;

public class ServiceInsuranceOffer {


    public void print(Secure bem){

        System.out.println("--------------------");
        System.out.println("Insurance proposal");
        System.out.println("--------------------");
        System.out.println(bem.description());
        System.out.printf("Premium: R$ %.2f", bem.calculatePremiumValue());




    }


}
