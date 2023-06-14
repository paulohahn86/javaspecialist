package com.algaworks.crm.accountspayable.model;

import com.algaworks.crm.accountspayable.PayableDocument;
import com.algaworks.crm.accountspayable.PaymentMethod;

public class Pix implements PaymentMethod {


    public void pay(PayableDocument document) {
        Beneficiary employer = document.getEmployer();

        if(employer.isNotPix()){
            throw new RuntimeException("Beneficiary has no Pix");
        }

        System.out.printf("DEBUG: Performing PIX for %s on the value of %.2f with the key %s%n\"",
                employer.getName(), document.getTotalValue(), employer.getKeyPix());


    }
}
