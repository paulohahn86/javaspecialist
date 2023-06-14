package com.algaworks.crm.crm.application;

import com.algaworks.crm.crm.model.Client;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Supermercado pague e leve",80000));
        clients.add(new Client("Posto Gasolina Boa",50000));
        clients.add(new Client("javac Consultoria", 58000000));


        double totalBilling = 0d;

        for(Client client : clients){
            totalBilling += client.getMonthlyBilling();
        }

        System.out.println(totalBilling);

    }




}
