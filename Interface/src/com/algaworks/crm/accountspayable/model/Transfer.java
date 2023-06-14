package com.algaworks.crm.accountspayable.model;

import com.algaworks.crm.accountspayable.PayableDocument;
import com.algaworks.crm.accountspayable.PaymentMethod;

public class Transfer implements PaymentMethod {


    @Override
    public void pay(PayableDocument document) {
        Beneficiary beneficiary = document.getEmployer();

        if (beneficiary.isNotAccount()){
            throw new RuntimeException("Beneficiary does not have a bank account.");
        }

        System.out.printf("DEBUG: Making a TRANSFER to %s in the amount of %.2f with the bank account %s%n",
                beneficiary.getName(), document.getTotalValue(), beneficiary.getAccount());

    }
}
