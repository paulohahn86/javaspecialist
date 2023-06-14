package com.algaworks.agendamento.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter FORMAT_DATA = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private static final DateTimeFormatter FORMAT_TIME = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMAT_PT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
            .localizedBy(new Locale("pt","BR"));


    public static void main(String[] args) {
        LocalDate dateEvent = getdate("Date: ");
        LocalTime timeEvent = getTime("Time: ");

        LocalDateTime dateTime = dateEvent.atTime(timeEvent);
        System.out.printf("Event scheduled for %s%n",dateTime.format(FORMAT_PT));
    }

    private static LocalDate getdate(String descrition){
        while(true){
            try{
                System.out.print(descrition);
                String date = SCANNER.nextLine();
                return LocalDate.parse(date, FORMAT_DATA);
            }catch (DateTimeParseException e){
                System.out.println("Invalid date. Try Again!!!");
            }
        }
    }

    private static LocalTime getTime(String description){
        while(true){
            try{
                System.out.print(description);
                String time = SCANNER.nextLine();
                return LocalTime.parse(time, FORMAT_TIME);
            }catch (DateTimeParseException e){
                System.out.println("Invalid time. Try Again!!");
            }
        }
    }

}
