package com.algaworks.airline.model;

public class BookNotFoundException extends RuntimeException{

    public BookNotFoundException() {
    }

    public BookNotFoundException(String message) {
        super(message);
    }
}
