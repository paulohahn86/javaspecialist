package com.algaworks.detran.application;

import com.algaworks.detran.model.Car;
import com.algaworks.detran.model.Owner;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {



        Owner maria = new Owner("Maria", "0329852093523");
        Owner ana = new Owner("Ana", "12847189274812");
        Owner jose = new Owner("José", "2498172489723");
        Owner joao = new Owner("João", "892174983278");

        Car bmw = new Car("ALG1234", "BMW");
        Car honda = new Car("ALG2234", "HONDA");
        Car ford = new Car("ALG2342", "FORD");
        Car porsche = new Car("ALG9876", "PORSCHE");

        // Send the order of insertion of the keys
        // Map<Carro, Proprietario> proprietarios = new LinkedHashMap<>();

        // Send the natural order of the key elements and
        // implements the comparable interface or class Comparator, does not allow Nul key
        // Map<Carro, Proprietario> proprietarios = new TreeMap<>();

        // Do not send the insertion order
        Map<Car, Owner> proprietarios = new HashMap<>();
        proprietarios.put(bmw,maria);
        proprietarios.put(honda,ana);
        proprietarios.put(ford,jose);
        proprietarios.put(porsche,maria);

/*
        for (Carro carro : proprietarios.keySet()){
            System.out.println(carro.getPlaca() + " - " + carro.getModelo());
        }

        System.out.println();
        for (Proprietario proprietario : proprietarios.values()){
            System.out.println(proprietario.getCpf() + " - " + proprietario.getNome());
        }

        System.out.println();*/

        for (Map.Entry<Car, Owner> proprietario : proprietarios.entrySet()){
            System.out.println(proprietario.getKey().getLicensePlate() + " - " + proprietario.getKey().getModel() +
                    "  *** " + proprietario.getValue().getCpf() + " - " + proprietario.getValue().getName());
        }



    }
}
