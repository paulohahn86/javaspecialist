package com.algaworks.airline.model;

import java.util.Objects;

public class Book {

    private final String id;
    private final Flight flight;
    private final Passenger passenger;
    private int quantityLuggage;


    public Book(String id, Flight flight, String passengerName) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(flight);
        Objects.requireNonNull(passengerName);
        this.id = id;
        this.flight = flight;
        this.passenger = new Passenger(passengerName);
    }

    public String getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public int getQuantityLuggage() {
        return quantityLuggage;
    }

    public void addLuggage(int quantity) {
        this.quantityLuggage += quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return quantityLuggage == book.quantityLuggage && Objects.equals(id, book.id) && Objects.equals(flight, book.flight) && Objects.equals(passenger, book.passenger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flight, passenger, quantityLuggage);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", flight=" + flight +
                ", passenger=" + passenger +
                ", quantityLuggage's=" + quantityLuggage +
                '}';
    }
}
