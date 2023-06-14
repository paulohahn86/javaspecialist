package com.algaworks.challenge.model;

import java.util.Optional;

public class Client {

    private final String name;
    private Address address;

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Optional<Address> getAddress() {
        return Optional.ofNullable(address);
    }
}
