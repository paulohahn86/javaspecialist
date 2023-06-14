package com.algaworks.airline.model;

import java.util.*;

public class ServiceBook {

    private final Set<Book> books = new HashSet<>();

    public Collection<Book> getBooks(){
        return Collections.unmodifiableSet(books);
    }

    public void adicionar(Book book){
        boolean addBook = books.add(book);

        if(!addBook){
            throw new RuntimeException(
                    String.format("Book %s already exist", book.getId()));
        }
    }

    public Optional<Book> find(String id){
        //Reserva reservaEncontrada = null;

        for(Book book : books){
            if(book.getId().equals(id)){
                return Optional.of(book);
//                reservaEncontrada = book;
//                break;
            }
        }
        return Optional.empty();
        //return Optional.ofNullable(reservaEncontrada);
    }


}
