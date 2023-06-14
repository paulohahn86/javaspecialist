package com.algaworks.sealedClass;

import com.algaworks.sealedClass.entity.Client;
import com.algaworks.sealedClass.service.CsvGenerator;

import java.time.LocalDate;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

        var clients = Arrays.asList(new Client(1L,"João", LocalDate.parse("2005-03-10")),
                new Client(2L,"Maria", LocalDate.parse("1981-09-13")),
                new Client(3L,"Manoel", LocalDate.parse("1986-11-30")),
                new Client(4L,"Ana", LocalDate.parse("1992-05-02")));

        CsvGenerator.print(Client.class,clients);


    }
}
