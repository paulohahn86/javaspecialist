package com.algaworks.bank;

import java.util.Objects;

public class Holder {
    private String name;
    private final String cpf;


    public Holder(String name, String cpf) {

        Objects.requireNonNull(name);
        Objects.requireNonNull(cpf);
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
