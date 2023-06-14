package com.algaworks.calculadora.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {

        LocalDate date = getDate();
        System.out.println("Enter the number of installments: ");
        int size = SCANNER.nextInt();
        print(date,size);
    }

    public static LocalDate getDate(){
        while(true) {
            try {
                System.out.println("Date of first installment:" );
                return LocalDate.parse(SCANNER.nextLine(), DATE_TIME_FORMATTER);
            } catch (DateTimeParseException e) {
                System.out.println("Invalid Date! Try again");
            }
        }
    }

    public static void print(LocalDate date, int size){
        for (int i = 0; i < size; i++) {
            System.out.println("Installment #" + (i+1) + " - " + date.plusMonths(i).format(DATE_TIME_FORMATTER));
        }
    }
}
