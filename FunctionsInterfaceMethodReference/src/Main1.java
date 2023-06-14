import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main1 {

    public static void main(String[] args) {

        // MAINs FunctionInterface

        // PREDICATE<T> retorna um boolean dada uma expressão(Lambda);

        Predicate<String> predicate = str -> str.startsWith("T");
        boolean startT = predicate.test("Thiago");
        System.out.println(startT);

        // FUNCTION<T,R> recebi um argumento do tipo T e retorna do tipo R

        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate date = function.apply("2000-02-08");
        System.out.println(date);

        // SUPPLIER retorna um argumento do tipo T

        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime dateTime = supplier.get();
        System.out.println(dateTime);

        // CONSUMER processa um argumento e não retorna nada

        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Olá mergulador");
    }
}
