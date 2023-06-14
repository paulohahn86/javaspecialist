package com.algaworks.crm.financial.service;

import com.algaworks.crm.financial.model.FinancialClient;

public class ServiceFinancial {


    public void applyFinancial(FinancialClient client, double requestedValue){

        double approvedLimit = consultApprovedLimit(client);
        double calculateRates = client.calculateRates(requestedValue);

        if(approvedLimit < requestedValue){
            throw new RuntimeException(String.format(
                    "Financing not approved. Maximum Limit of %.2f", approvedLimit));
        }

        System.out.printf("DEBUG: Financing approved of R$ %.2f with interest of %.2f%%. Maximum limit of %.2f%n",
                requestedValue, calculateRates, approvedLimit);

    }

    public double consultApprovedLimit(FinancialClient client){
        return client.calculateApprovedLimit();
    }


}
