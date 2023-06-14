package com.algaworks.desafio1.application;

import com.algaworks.challenge.model.Invoice;

public class Principal {

    public static void main(String[] args) {
        Invoice nf = new Invoice(123, "Macbook Pro", 1800);
        System.out.println(nf.getFullDescription());

        nf.issue();
        System.out.println(nf.getFullDescription());

        nf.cancel(); // IllegalStateException
        System.out.println(nf.getFullDescription());
    }
}
