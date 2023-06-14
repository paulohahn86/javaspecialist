package com.algaworks.crm.sorteio.model;

public class Supplier implements Nameable {

    private String socialReason;

    public Supplier(String nome) {
        this.socialReason = nome;
    }

    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    @Override
    public String getSearch() {
        return getSocialReason();
    }
}
