package com.algaworks.resume;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RegisterClient {

    private final List<Client> clients = new ArrayList<>();


    public List<Client> getClients() {
        return clients;
    }

    public void add(Client client){
        clients.add(client);
    }

    public List<Client> findClient(Predicate<Client> clientPredicate){
        List<Client> clientList = new ArrayList<>();

        for (Client cliente: clients) {
            if(clientPredicate.test(cliente)){
                clientList.add(cliente);
            }
        }
        return clientList;
    }

}
