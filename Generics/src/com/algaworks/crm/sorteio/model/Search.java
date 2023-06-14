package com.algaworks.crm.sorteio.model;

import java.util.List;

public class Search {

    public static <T extends Nameable> T getName(List<T> items, String name){
        for(T item : items){
            if(item.getSearch().equals(name)){
                return item;
            }

        }

        throw new RuntimeException("resource not found");
    }
}
