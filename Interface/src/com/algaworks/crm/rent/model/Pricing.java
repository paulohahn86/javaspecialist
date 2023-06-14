package com.algaworks.crm.rent.model;

public interface Pricing {
    double calculateValueTotal(Notebook notebook, int hoursUsed);

}
