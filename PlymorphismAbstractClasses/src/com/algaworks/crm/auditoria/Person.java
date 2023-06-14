package com.algaworks.crm.auditoria;

public abstract class Person {

    private String name;

    public Person(String nome){
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public abstract double CalculateTax();
}
