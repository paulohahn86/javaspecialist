package com.algaworks.challenge.model;

import java.util.Objects;

public class City implements Comparable<City>{

    private int idIbge;
    private String name;
    private int totalPopulation;

    public City(int idIbge, String name, int totalPopulation) {
        this.idIbge = idIbge;
        this.name = name;
        this.totalPopulation = totalPopulation;
    }

    public int getIdIbge() {
        return idIbge;
    }

    public void setIdIbge(int idIbge) {
        this.idIbge = idIbge;
    }

    @Override
    public String toString() {
        return "City{" +
                "idIbge=" + idIbge +
                ", name='" + name + '\'' +
                ", totalPopulation=" + totalPopulation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City cidade = (City) o;
        return idIbge == cidade.idIbge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIbge);
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare(getIdIbge(),o.getIdIbge());
    }
}
