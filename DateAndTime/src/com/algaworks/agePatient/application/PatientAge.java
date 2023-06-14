package com.algaworks.agePatient.application;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class PatientAge {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));

    public static void main(String[] args) {

        System.out.println("--- Patient age ---");
        LocalDate date = getAge();
        LocalDate today = LocalDate.now();


        Period period = date.until(today);


        System.out.println("Patient had " + ((period.getYears() <= 1) ? period.getYears() + " year, " : period.getYears() + " years, ")
        + ((period.getMonths() <= 1) ? period.getMonths() + " Month, " : period.getMonths() + " months, ")
                + ((period.getDays() <= 1) ? period.getDays() + "day of life" : period.getDays() + " days of life"));

    }

    private static LocalDate getAge() {
        while (true) {
            try {
                System.out.println("Birthday: ");
                return LocalDate.parse(SCANNER.nextLine(), DATE_FORMATTER);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid date. Try again!!!");
            }
        }
    }

}

