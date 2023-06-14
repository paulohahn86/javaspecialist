package com.algaworks.detran.model;

import java.util.Objects;

public class Owner {

    private String name;
    private String cpf;

    public Owner(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);
        this.name = nome;
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

    public void setCpf(String cpf) {
        this.cpf = cpf;

    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
