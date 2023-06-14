package com.algaworks.challenge.application;

import com.algaworks.challenge.model.Invoice;

public class Main {

    public static void main(String[] args) {
        Invoice nf = new Invoice(123, "Macbook Pro", 800);
        System.out.println(nf.getFullDescription());

        nf.issue();
        System.out.println(nf.getFullDescription());

        nf.cancel(); // IllegalStateException
        System.out.println(nf.getFullDescription());
    }
}
