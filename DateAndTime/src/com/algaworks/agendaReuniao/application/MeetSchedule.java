package com.algaworks.agendaReuniao.application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class MeetSchedule {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final DateTimeFormatter FORMATTER_PT_BR = DateTimeFormatter
            .ofLocalizedDate(FormatStyle.FULL)
                    .localizedBy(new Locale("pt","BR"));

    public static final DateTimeFormatter FORMATTER_OUT = DateTimeFormatter
            .ofPattern("MMMM 'of' yyyy", new Locale("pt", "BR"));

    public static void main(String[] args) {

        System.out.print("Year: ");
        int ano = SCANNER.nextInt();
        System.out.print("Month: ");
        int mes = SCANNER.nextInt();

        LocalDate data = LocalDate.of(ano, Month.of(mes), 1);
        List<LocalDate> generateSchedule = generateSchedule(data);
        System.out.printf("Generating annual meeting agendas from %s ...%n",data.format(FORMATTER_OUT));
        print(generateSchedule);


    }

    public static void print(List<LocalDate> localDates){

        for (LocalDate localDate: localDates) {
            System.out.println(localDate.format(FORMATTER_PT_BR));
        }
    }

    public static List<LocalDate> generateSchedule(LocalDate localDate){
        List<LocalDate> localDates = new ArrayList<>();

        for (int mes = localDate.getMonthValue(); mes <= Month.DECEMBER.getValue(); mes++){
            localDates.add(localDate.withMonth(mes).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY)));
        }

        return localDates;
    }



}
