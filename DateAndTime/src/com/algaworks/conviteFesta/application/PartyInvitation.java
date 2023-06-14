package com.algaworks.conviteFesta.application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class PartyInvitation {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final DateTimeFormatter LOCAL_DATE = DateTimeFormatter
            .ofPattern("dd/MM/yyyy", new Locale("pt","BR"));

    public static final DateTimeFormatter LOCAL_TIME = DateTimeFormatter
            .ofPattern("HH:mm", new Locale("pt","BR"));

    public static final DateTimeFormatter LOCAL_DATE_TIME = DateTimeFormatter
            .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)", new Locale("pt","BR"));

    public static void main(String[] args) {

        LocalDate localDate = getData();
        LocalTime localTime = getHora();

        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
       // System.out.println(localDateTime.format(LOCAL_DATE_TIME));

        ZonedDateTime defaultZonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        ZonedDateTime saoPauloZonedDateTime = defaultZonedDateTime.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime losAngelesZonedDateTime = defaultZonedDateTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime JapanZonedDateTime = defaultZonedDateTime.withZoneSameInstant(ZoneId.of("Japan"));


        System.out.println(saoPauloZonedDateTime.format(LOCAL_DATE_TIME ));
        System.out.println(losAngelesZonedDateTime.format(LOCAL_DATE_TIME));
        System.out.println(JapanZonedDateTime.format(LOCAL_DATE_TIME));

    }


    public static LocalDate getData(){
        while(true){
            try{
                System.out.print("Inform the date of the party: ");
                return LocalDate.parse(SCANNER.nextLine(), LOCAL_DATE);
            }catch (DateTimeParseException e){
                System.out.println("Invalid date, try again!!");
            }
        }
    }

    public static LocalTime getHora(){
        while(true){
            try{
                System.out.print("Inform the time of the party: ");
                return LocalTime.parse(SCANNER.nextLine(), LOCAL_TIME);
            }catch (DateTimeParseException e){
                System.out.println("Invalid time, try again!!");
            }
        }
    }
}
