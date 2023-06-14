package com.algaworks.estoque;

public class ServiceProductInactive {

    public void process(Product produc){
        System.out.println("Inactivating " + produc.getName());
        produc.inactivate();
    }
}
