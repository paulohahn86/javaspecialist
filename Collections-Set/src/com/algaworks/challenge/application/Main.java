package com.algaworks.challenge.application;

import com.algaworks.challenge.model.City;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Performance is more important (does not guarantee the order of the elements)
        // Set<City> cities = new HashSet<>();

        // Performance is important, but it needs to maintain element insertion order
        // Set<City> cities = new LinkedHashSet<>();

        // Performance is less important and needs to maintain the natural order of the elements
        Set<City> cities = new TreeSet<>();

        cities.add(new City(3170206, "Uberlândia", 706_597));
        cities.add(new City(3170107, "Uberaba", 340_277));
        cities.add(new City(3550308, "São Paulo", 12_396_372));
        cities.add(new City(3106200, "Belo Horizonte", 2_530_701));
        cities.add(new City(2304400, "Fortaleza", 2_703_391));
        cities.add(new City(1100205, "Porto Velho", 548_952));

        // Iterar no conjunto de cities
        for (City city: cities) {
            System.out.println(city.toString());
        }
    }
}
