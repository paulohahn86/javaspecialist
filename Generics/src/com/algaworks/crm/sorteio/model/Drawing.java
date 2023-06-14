package com.algaworks.crm.sorteio.model;

import java.util.List;
import java.util.Random;

public class Drawing {

    private static final Random RANDOM = new Random();

    public static <T> T drawing(List<T> obj){

        if(obj.size() == 0){
            throw new IllegalArgumentException("Minimum of 1 object required");
        }
        int position = RANDOM.nextInt(obj.size());

        return obj.get(position);

    }

}
