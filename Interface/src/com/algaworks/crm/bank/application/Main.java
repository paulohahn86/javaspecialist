package com.algaworks.crm.bank.application;

import com.algaworks.crm.bank.model.Account;
import com.algaworks.crm.bank.model.TaxableAccount;
import com.algaworks.crm.bank.model.ContaCorrente;
import com.algaworks.crm.bank.model.ScoreDecorator;

public class Main {

    public static void main(String[] args) {

        ScoreDecorator pontuacao = new ScoreDecorator(new ContaCorrente());
        Account conta1 = new TaxableAccount(pontuacao);
        Account conta2 = new ContaCorrente();


        conta1.deposit(1000);
        conta1.withdraw(100);
        conta1.transfer(conta2, 100);

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getBalance());
        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getBalance());
        System.out.printf("Pontos da conta 1: %d%n", pontuacao.getScores());

    }
}
