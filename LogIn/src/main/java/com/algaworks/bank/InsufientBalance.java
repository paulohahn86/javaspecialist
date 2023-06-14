package com.algaworks.bank;

public class InsufientBalance extends RuntimeException{

    public InsufientBalance(String message) {
        super(message);
    }

}
