import java.util.function.*;

public class Main2 {

    public static void main(String[] args) {

        // VARIAÇÕES DAS INTERFACES FUNCIONAIS

        IntPredicate predicate = num -> num < 10;
        System.out.println(predicate.test(1));

        IntFunction<String> function = num -> "Numero = " + num;
        System.out.println(function.apply(10));

        IntSupplier supplier = () -> 20;
        System.out.println(supplier.getAsInt());

        IntConsumer consumer = num -> System.out.println("Numero é " + num);
        consumer.accept(30);








    }
}
