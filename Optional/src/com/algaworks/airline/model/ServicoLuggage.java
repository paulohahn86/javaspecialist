package com.algaworks.airline.model;

import java.util.Objects;

public class ServicoLuggage {

    public ServiceBook serviceBook;

    public ServicoLuggage(ServiceBook serviceBook){
        Objects.requireNonNull(serviceBook);
        this.serviceBook = serviceBook;
    }

    public void contratar(String idBook, int quantity){
        if(quantity <= 0){
            throw new IllegalArgumentException("Invalid Quantity of Baggage");
        }

 //       Optional<Reserva> reserva = servicoDeReserva.buscar(idBook);
//       if(reserva.isEmpty()){
//           throw new ReservaNaoEncontradaException("Reserva não existe!");
//        }
//        reserva.get().adicionarBagagens(quantity);


        // fetches the reservation and encapsulates it in an Optional if it returns null throws an exception
        // else exists and calls the addBag method
        serviceBook.find(idBook)
                .orElseThrow(BookNotFoundException::new)// method reference
           //   .orElseThrow(() -> new BookNoutFoundException("Book Not Found."))   // Lambda expression
                .addLuggage(quantity);


    }
}
