package com.algaworks.airline.model;

import java.util.Objects;

public class Passenger {

    private String name;

    public Passenger(String nome) {
        Objects.requireNonNull(nome);
        this.name = nome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger that = (Passenger) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}
