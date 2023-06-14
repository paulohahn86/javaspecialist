package com.algaworks.crm.financeiro;

public class Main {

    public static void main(String[] args) {
        Supplier imobiliaria = new Supplier("Zé Negócios Imobiliários");

        AccountPayable accountPayable = new AccountPayable();
        accountPayable.setDescription("Flat Hire");
        accountPayable.setValue(4500);
        accountPayable.setDueDate("10/07/2022");
        accountPayable.setSupplier(imobiliaria);

        printAccount(accountPayable);

        accountPayable.pay();
        printAccount(accountPayable);

        // Pagar a mesma conta novamente deve ser impedido
        //accountPayable.pagar();

        accountPayable.cancelPayment();
        printAccount(accountPayable);

        // Cancelar o pagamento de uma conta pendente deve ser impedido
        // accountPayable.cancelarPagamento();
    }

    public static void printAccount(AccountPayable accountPayable) {
        System.out.printf("Suppier: %s%n", accountPayable.getSupplier().getName());
        System.out.printf("Description: %s%n", accountPayable.getDescription());
        System.out.printf("Due date: %s%n", accountPayable.getDueDate());
        System.out.printf("Value: R$%.2f%n", accountPayable.getValue());
        System.out.printf("Paid: %s%n", accountPayable.isPaid() ? "Sim" : "Não");
        System.out.println();
    }

}
