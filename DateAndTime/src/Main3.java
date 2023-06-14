import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main3 {

    public static void main(String[] args) {

        // DayOfWeek diaDaSemana = DayOfWeek.MONDAY;
       // DayOfWeek diaDaSemana = DayOfWeek.of(1);
      // DayOfWeek diaDaSemana = DayOfWeek.from(LocalDate.now());
        DayOfWeek diaDaSemana = LocalDate.now().getDayOfWeek();

        System.out.println(diaDaSemana);

        System.out.println(DateTimeFormatter.ofPattern("E")
                .withLocale(new Locale("pt","Br"))
                .format(diaDaSemana));

        System.out.println(diaDaSemana.getDisplayName(TextStyle.FULL, new Locale("pt","BR")));

        DayOfWeek diadaSemanaHoje = LocalDate.now().getDayOfWeek();
        DayOfWeek diaDaSemanaQuinzeDias = diadaSemanaHoje.plus(15);

        System.out.println(diaDaSemanaQuinzeDias.getDisplayName(TextStyle.FULL, new Locale("pt","BR")));

        // PARA MONTH I DO SAME DAY OF WEEK


    }
}
