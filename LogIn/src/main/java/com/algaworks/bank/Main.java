package com.algaworks.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;


public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Holder holder = new Holder("Paulo Augusto Hahn","05912889904");
        CurrentAccount currentAccount = new CurrentAccount(holder, 2600,873651);

        logger.debug("Transition beginning");
        currentAccount.deposit(new BigDecimal(100.00));
        currentAccount.deposit(new BigDecimal(400.00));
        //currentAccount.deposit(new BigDecimal(0));
        currentAccount.withDraw(new BigDecimal(110.00));
        logger.debug("Transition finalized");

        currentAccount.printStatement();





    }
}
