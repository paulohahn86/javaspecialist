package com.algaworks.crm.financeiro;

import java.io.Serializable;

public class Supplier implements Serializable {


    private String name;

    Supplier(){

    }

    Supplier(String nome){
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
