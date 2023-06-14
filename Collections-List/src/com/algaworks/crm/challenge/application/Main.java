package com.algaworks.crm.challenge.application;

import com.algaworks.crm.challenge.model.TravelPackage;
import com.algaworks.crm.challenge.service.AddTravelPackage;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AddTravelPackage addTravelPackage = new AddTravelPackage();
        addTravelPackage.add("Istanbul and Cappadocia (20 nights)", 18_000);
        addTravelPackage.add("Istanbul e Cappadocia (20 nights)", 18_000);
        addTravelPackage.add("Show in Bariloche (10 nights)", 11_000);
        addTravelPackage.add("Disney (10 nights)", 20_000);
        addTravelPackage.add("Light Christmas in Gramado (5 nights)", 8_500);



        addTravelPackage.deleteByDescription("Disney (10 nights)");

        addTravelPackage.sort();
        addTravelPackage.sortByPrice();

        TravelPackage foundPackage = addTravelPackage.searchByDescription("Disney (10 nights)");
        System.out.println(foundPackage);

        printPackage(addTravelPackage.findAll());
    }

    private static void printPackage(List<TravelPackage> packages) {

        for (TravelPackage travelPackage : packages){
            System.out.println(travelPackage.toString());
        }

    }

}
