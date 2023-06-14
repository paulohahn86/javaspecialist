package com.algaworks.crm;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class Client implements Serializable {

    @Serial
    private static final long serialVersionUID = -1895395427342213819L;
    private String name;
    private final Address address;
    private BigDecimal creditLimit;

    public Client(String name, Address address, BigDecimal creditLimit) {
        this.name = name;
        this.address = address;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
