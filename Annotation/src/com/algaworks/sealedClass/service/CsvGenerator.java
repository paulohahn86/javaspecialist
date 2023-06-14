package com.algaworks.sealedClass.service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvGenerator {


    public static <T> void print(Class<T> clazz, List<T> objetos) {

        Field[] field = clazz.getDeclaredFields();
        System.out.println(Arrays.stream(field)
                .filter(field1 -> field1.isAnnotationPresent(Campo.class))
                .map(Field::getName)
                .collect(Collectors.joining(";")));


        objetos.forEach(CsvGenerator::print);
    }

    private static void print(Object client) {
        Field[] field = client.getClass().getDeclaredFields();
        List<String> value = new ArrayList<>();
        for (Field fields : field) {
            try {
                if(fields.isAnnotationPresent(Campo.class)){
                    Campo annotation = fields.getAnnotation(Campo.class);
                    fields.setAccessible(true);
                    Object obj = fields.get(client);
                    String resultString = obj == null ? "" : obj.toString();
                    value.add(annotation.upperCase() ? resultString.toUpperCase() : resultString);
                }

            } catch (IllegalAccessException e) {
                throw new RuntimeException(e); //TODO
            }

        }
        System.out.println(value.stream().collect(Collectors.joining(";")));

    }

}
