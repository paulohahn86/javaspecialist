package com.algaworks.challenge.model;

import java.util.Objects;

public class State implements Comparable<State>{

    private String abbreviation;
    private String name;

    public State(String abbreviation, String name) {
        Objects.requireNonNull(abbreviation);
        Objects.requireNonNull(name);

        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "State{" +
                "abbreviation='" + abbreviation + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State estado = (State) o;
        return Objects.equals(name, estado.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(State o) {
        return getName().compareTo(o.getName());
    }
}
