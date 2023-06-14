package com.algaworks.challenge.model;

import java.util.Optional;

public class Address {

    private final String address;
    private final String number;
    private final String district;
    private City city;
    private boolean privateResidence;


    public Address(String address, String number, String district) {
        this.address = address;
        this.number = number;
        this.district = district;
    }

    public Address(String address, String number, String district, City city) {
        this.address = address;
        this.number = number;
        this.district = district;
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getDistrict() {
        return district;
    }

    public Optional<City> getCity() {
        return Optional.ofNullable(city);
    }

    public boolean isPrivateResidence() {
        return privateResidence;
    }

    public void setPrivateResidence(boolean privateResidence) {
        this.privateResidence = privateResidence;
    }
}
