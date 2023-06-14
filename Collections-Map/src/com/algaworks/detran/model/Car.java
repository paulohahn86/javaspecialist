package com.algaworks.detran.model;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String licensePlate;
    private String model;

    public Car(String placa, String modelo) {

        Objects.requireNonNull(placa);
        Objects.requireNonNull(modelo);
        this.licensePlate = placa;
        this.model = modelo;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + licensePlate + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car carro = (Car) o;
        return Objects.equals(licensePlate, carro.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }

    @Override
    public int compareTo(Car o) {
        return getLicensePlate().compareTo(o.getLicensePlate());
    }
}
