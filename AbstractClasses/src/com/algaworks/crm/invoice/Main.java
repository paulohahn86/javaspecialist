package com.algaworks.crm.invoice;

public class Main {

    public static void main(String[] args) {

        var invoiceController = new InvoiceController();

        var nfBolaFutebol = new ProductInvoice("Soccer ball ", 300);
        var nfReparoMotor = new ServiceInvoice("Engine repair", 900, false);


        invoiceController.invoicesIssue(nfBolaFutebol,nfReparoMotor);
    }
}
