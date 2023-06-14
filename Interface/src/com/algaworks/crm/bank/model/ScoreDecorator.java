package com.algaworks.crm.bank.model;

public class ScoreDecorator extends BaseAccountDecorator {


    private int scores;

    public ScoreDecorator(Account baseAccount) {
        super(baseAccount);
    }

    public int getScores() {
        return scores;
    }

    @Override
    public void deposit(double value) {
        getBaseAccount().deposit(value);
        scores += value / 100;
    }

}
