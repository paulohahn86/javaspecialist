package com.algaworks.challenge.model;

import java.util.Objects;

public class Client {

    private String name;

    public Client(String nome) {
        setName(nome);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Objects.requireNonNull(name);
        this.name = name;
    }

}
