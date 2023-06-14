package com.algaworks.crm;

import java.io.Serial;
import java.io.Serializable;

public class Address implements Serializable {

    @Serial
    private static final long serialVersionUID = -2333772710369548606L;
    private String name;
    private Long number;
    private String district;

    public Address(String name, Long number, String district) {
        this.name = name;
        this.number = number;
        this.district = district;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", district='" + district + '\'' +
                '}';
    }
}
