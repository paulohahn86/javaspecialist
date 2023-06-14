package com.algaworks.crm.challenge.application;

import com.algaworks.crm.challenge.model.Clothes;
import com.algaworks.crm.challenge.model.Car;
import com.algaworks.crm.challenge.model.ManagerStock;

public class Main {

    public static void main(String[] args) {
        ManagerStock<Clothes> clothesManagerStock = new ManagerStock<Clothes>();
        // clothesManagerStock.adicionar(new Carro("BMW",4));
        clothesManagerStock.add(new Clothes("Calça", 5));
        clothesManagerStock.add(new Clothes("Camiseta", 10));
        printStock(clothesManagerStock);


        ManagerStock<Car> carManagerStock = new ManagerStock<>();
        carManagerStock.add(new Car("BMW X1", 4));
        carManagerStock.add(new Car("Fusca",10));
        printStock(carManagerStock);

    }

    private static void printStock(ManagerStock<?> managerStock){
        System.out.println("Stock:" + managerStock.getStockQuantity());
    }


}
