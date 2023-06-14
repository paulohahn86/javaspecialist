package com.algaworks.challenge.application;

import com.algaworks.challenge.model.City;
import com.algaworks.challenge.model.State;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        State mg = new State("MG", "Minas Gerais");
        State ce = new State("CE", "Ceará");
        State ro = new State("RO", "Rondônia");
        State sp = new State("SP", "São Paulo");

        City saoPaulo = new City(3550308, "São Paulo", 12_396_372);
        City beloHorizonte = new City(3106200, "Belo Horizonte", 2_530_701);
        City fortaleza = new City(2304400, "Fortaleza", 2_703_391);
        City portoVelho = new City(1100205, "Porto Velho", 548_952);

        // Performance is more important (Doesn't guarantee order)
        // Map<Estado,Cidade> capitais = new HashMap<>();

        // Performance is important, but you need to keep the order of insertion of the keys
        // Map<Estado,Cidade> capitais = new LinkedHashMap<>();

        // Performance is less important and needs to maintain the natural order of the keys
        Map<State, City> capitais = new TreeMap<>();
        capitais.put(sp, saoPaulo);
        capitais.put(mg, beloHorizonte);
        capitais.put(ce, fortaleza);
        capitais.put(ro, portoVelho);

        // Iteration on map entries (key/value)

        for (Map.Entry<State, City> capital : capitais.entrySet()){
            System.out.printf("%s: %s - %s / %s Population total %s %n",capital.getValue().getIdIBGE(), capital.getValue().getName(),
                    capital.getKey().getName(), capital.getKey().getAbbreviation(), capital.getValue().getTotalPopulation());
        }
    }
}
