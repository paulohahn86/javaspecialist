package com.algaworks.challenge.model;

public class City {

    private int idIBGE;
    private String name;
    private int totalPopulation;

    public City(int idIBGE, String name, int totalPopulation) {
        this.idIBGE = idIBGE;
        this.name = name;
        this.totalPopulation = totalPopulation;
    }

    public int getIdIBGE() {
        return idIBGE;
    }

    public void setIdIBGE(int idIBGE) {
        this.idIBGE = idIBGE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPopulation() {
        return totalPopulation;
    }

    public void setTotalPopulation(int totalPopulation) {
        this.totalPopulation = totalPopulation;
    }


    @Override
    public String toString() {
        return "City{" +
                "idIBGE=" + idIBGE +
                ", name='" + name + '\'' +
                ", totalPopulation=" + totalPopulation +
                '}';
    }
}
