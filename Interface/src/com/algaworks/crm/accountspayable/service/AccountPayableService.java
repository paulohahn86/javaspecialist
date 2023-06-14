package com.algaworks.crm.accountspayable.service;

import com.algaworks.crm.accountspayable.PayableDocument;
import com.algaworks.crm.accountspayable.PaymentMethod;

public class AccountPayableService {

    PaymentMethod paymentMethod;

    public AccountPayableService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pagar(PayableDocument document) {
            paymentMethod.pay(document);
    }
}
