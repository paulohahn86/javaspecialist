import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main2 {

    public static void main(String[] args) {

        // methods of conventions are immutable

       // LocalDate dataVencimento = LocalDate.parse("2023-10-04");
       // System.out.println(ChronoField.DAY_OF_MONTH.getFrom(dataVencimento));
       // System.out.println(dataVencimento.getLong(ChronoField.DAY_OF_MONTH));
       // System.out.println(dataVencimento.getMonthValue());

       // LocalDateTime dateTime = LocalDateTime.now();
       // LocalDateTime newDateTime = dateTime.with(ChronoField.DAY_OF_MONTH, 9);
      //  System.out.println(newDateTime);

        /*
        LocalDate today = LocalDate.now();
        System.out.println(today.plusMonths(2));
        System.out.println(today);
        */
        /*
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDate next = date.plus(30, ChronoUnit.DAYS );
        System.out.println(next);
        */
        /*
       Period period = Period.ofDays(45);
       Period period = Period.ofMonths(5);
       Period period = Period.of(5,1,10);
        Period period = Period.parse("P5Y1M10D");
        System.out.println(period);

       Period calculator = period.plus(Period.ofYears(10));
        Period calculator = period.plusYears(10);
        System.out.println(calculator);
    */
    /*
        LocalDate dataCompra = LocalDate.parse("2022-09-15");
        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

       // Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        Period tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println(tempoEntrega);

        // long tempoEntregaSemanas = dataCompra.until(dataEntrega,ChronoUnit.WEEKS);
        long tempoEntregaSemanas = ChronoUnit.WEEKS.between(dataCompra,dataEntrega);
        System.out.println(tempoEntregaSemanas);
    */
    /*
        Period tempoMedioEntrega = Period.parse("P1M5D");
        LocalDate hoje = LocalDate.now();
        LocalDate dataPrevistaEntrega = hoje.plus(tempoMedioEntrega);

        System.out.println(dataPrevistaEntrega);
    */

        LocalDateTime dataHoraCompra = LocalDateTime.parse("2022-11-12T21:30:00");
        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");

        Duration tempoEntrega = Duration.between(dataHoraCompra,dataHoraEntrega);
        System.out.println(tempoEntrega);

        //long tempoEntregaSegundos = dataHoraCompra.until(dataHoraEntrega,ChronoUnit.SECONDS);
        long tempoEntregaSegundos = ChronoUnit.SECONDS.between(dataHoraCompra,dataHoraEntrega);
        System.out.println(tempoEntregaSegundos);



    }
}
