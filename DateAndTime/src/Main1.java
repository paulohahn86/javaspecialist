import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main1 {

    public static void main(String[] args) {

        // Created a instant (UTC)
        Instant instant = Instant.now();
        System.out.println(instant);

        // Created a fixed date
        LocalDate fixedDate = LocalDate.of(1986,8,2);
        System.out.println(fixedDate);

        //Created a fixed time
        LocalTime fixedTime = LocalTime.of(7,14,23);
        System.out.println(fixedTime);

        //Created a fixed DateTime
        LocalDateTime dateTime = LocalDateTime.of(1988,3,16,12,34);
        System.out.println(dateTime);

        //get time
        LocalTime time = LocalTime.from(dateTime);
        System.out.println(time);

        //get date
        LocalDate date = LocalDate.from(dateTime);
        System.out.println(date);

        //Format Time
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(LocalTime.now().format(DateTimeFormatter.ISO_TIME));
        //Format date
        System.out.println((LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        //format dateTime
        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy 'às' HH:mm:ss")));

        //Convert String to LocalDateTime ISO8601
        Instant string = Instant.parse("1986-08-02T09:45:20-03:00");
        System.out.println(string);




    }
}
