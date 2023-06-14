package com.algaworks.employee;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Main {

    public static void main(String[] args) throws IOException {

        //'

        Path root = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\Serializable");
        /*Path file = root.resolve(Path.of("file.ser"));

        var employee = new Employee("Paulo",
                LocalDate.of(1986, Month.AUGUST,02),
                new BigDecimal(2500));

        // Serializable a Object
        try(var outputStream = new ObjectOutputStream(Files.newOutputStream(file, WRITE, CREATE))){
            outputStream.writeObject(employee);
        };*/

        /*Path file = root.resolve(Path.of("file.ser"));
        // Deserializable a Object
        try(var intPutStream = new ObjectInputStream(Files.newInputStream(file, StandardOpenOption.READ))){
            Object employee = intPutStream.readObject();
            System.out.println(employee);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }*/
    }
}
