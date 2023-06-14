package com.algaworks.airline.application;

import com.algaworks.airline.model.*;

public class Main {

    public static void main(String[] args) {
        var servicoDeReserva = new ServiceBook();
        var servicoDeBagagem = new ServicoLuggage(servicoDeReserva);
        var voo = new Flight("G312333","UDI","GRU");

        servicoDeReserva.adicionar(new Book("28A888", voo, "João"));
        servicoDeReserva.adicionar(new Book("28B111", voo, "Maria"));
        servicoDeReserva.adicionar(new Book("28C222", voo, "Sebatião"));

        servicoDeBagagem.contratar("28A888",2);

        Passenger passageiro = servicoDeReserva.find("28A888")
                .filter(r -> r.getQuantityLuggage() > 0)
                .map(Book::getPassenger)
                .orElseThrow(RuntimeException::new);

//        Reserva reserva = servicoDeReserva.buscar("28A888")
//                .filter(r -> r.getQuantidadeBagagens() > 0)
//                .orElseThrow(RuntimeException::new);
//        System.out.println(reserva);
//        servicoDeReserva.getReservas().forEach(System.out::println);


    }
}
