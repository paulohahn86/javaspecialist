package com.algaworks.crm.accountspayable.model;

public class Beneficiary {

    private String name;
    private String keyPix;
    private String Account;

        public Beneficiary(String name, String keyPix, String Account) {
        this.name = name;
        this.keyPix = keyPix;
        this.Account = Account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyPix() {
        return keyPix;
    }

    public void setKeyPix(String keyPix) {
        this.keyPix = keyPix;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        this.Account = account;
    }


    public boolean isNotPix(){
            return getKeyPix() == null || getKeyPix().isEmpty();
    }

    public boolean isNotAccount(){
            return getAccount() == null || getAccount().isEmpty();
    }

}
