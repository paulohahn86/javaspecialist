package com.algaworks.challenge.application;

import com.algaworks.challenge.model.City;
import com.algaworks.challenge.model.Client;
import com.algaworks.challenge.model.Address;
import com.algaworks.challenge.model.TypeOfResidenceInvalidException;

public class Main {

    public static void main(String[] args) {

        var address1 = new Address("Av Rondon Pacheco", "2000", "Santa Maria");
        var address2 = new Address("Av Afonso Pena", "3000", "Centro", new City("Uberlândia"));
        var address3 = new Address("Av João Naves", "1000", "Santa Mônica", new City("Uberlândia"));
        address3.setPrivateResidence(true);

        var client1 = new Client("João da Silva");
        var client2 = new Client("Sebastião Coelho", address1);
        var client3 = new Client("Manoel Filho", address2);
        var client4 = new Client("Maria da Silva", address3);

       // System.out.println(obterNomeCidadeResidenciaPropria(client1));
       // System.out.println(obterNomeCidadeResidenciaPropria(client2));
       // System.out.println(obterNomeCidadeResidenciaPropria(client3));
        System.out.println(getData(client4));

    }

    private static String getData(Client client){

        return client.getAddress().filter(Address::isPrivateResidence)
                        .flatMap(Address::getCity)
                        .map(City::name)
                        .orElseThrow(TypeOfResidenceInvalidException::new);
    }

}
