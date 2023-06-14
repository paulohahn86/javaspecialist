package com.algaworks.crm.accountspayable;

import com.algaworks.crm.accountspayable.model.Beneficiary;

public interface PayableDocument {

    double getTotalValue();
    Beneficiary getEmployer();

}
