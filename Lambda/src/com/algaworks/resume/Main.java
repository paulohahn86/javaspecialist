package com.algaworks.resume;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // rather use functional interfaces than create your own interface and insert the @FunctionalInterface annotation
        // in this example the Fitro class is obsolete




        var registerClient = new RegisterClient();
        registerClient.add(new Client("João", 90));
        registerClient.add(new Client("Maria", 30));
        registerClient.add(new Client("Sebastião", 50));
        registerClient.add(new Client("Joaquina", 45));
        registerClient.add(new Client("Josefina", 25));

        /*
        List<Cliente> clientes = registerClient.consultar((Cliente cliente) -> {
           boolean resultado = cliente.getIdade() > 40;
           return resultado;
        });
        */
        List<Client> clientes = registerClient.findClient(cliente -> cliente.getAge()>40 && cliente.getAge() < 80);

        //comparetor using lambda
        ///List<Cliente> clientes = registerClient.getClientes();
        //clientes.sort((cliente1, cliente2) -> Integer.compare(cliente1.getIdade(), cliente2.getIdade()));


        clientes.forEach(cliente -> System.out.printf("%s - %d%n", cliente.getName(),cliente.getAge()));

    }
}
