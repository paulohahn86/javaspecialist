package com.algaworks.crm;

import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static java.nio.file.StandardOpenOption.*;

public class Main {

    public static void main(String[] args) {

        var address = new Address("Rue du Grunewald", 29L, "Neudorf");
        var client = new Client("Paulo Augusto Hahn", address, new BigDecimal("2500.00"));

        Path root = Path.of("C:\\Users\\paulo\\IdeaProjects\\Algaworks\\Serializable\\src\\com\\algaworks\\crm\\objetos");
        Path file = root.resolve(Path.of("clientFile.ser"));

        try(var objectOutputStream = new ObjectOutputStream(Files.newOutputStream(file, WRITE, CREATE))){
            objectOutputStream.writeObject(client);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(var objectInputStream = new ObjectInputStream(Files.newInputStream(file, READ))){
            Object client1 = objectInputStream.readObject();
            System.out.println(client1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
