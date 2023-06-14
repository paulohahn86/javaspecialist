package com.algaworks.crm.invoice;

public class InvoiceController {

    public void invoicesIssue(Invoice... invoices) {
        for(Invoice invoice : invoices){
            invoice.issue();
            System.out.println();
        }
    }

}
