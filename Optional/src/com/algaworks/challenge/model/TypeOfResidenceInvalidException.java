package com.algaworks.challenge.model;

public class TypeOfResidenceInvalidException extends RuntimeException{

    public TypeOfResidenceInvalidException() {
    }

    public TypeOfResidenceInvalidException(String message) {
        super(message);
    }
}
