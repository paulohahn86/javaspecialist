import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        Integer[] notas = {8,9,10,4,5};

        Arrays.sort(notas); // crescente

        String crescente = Arrays.toString(notas);
        System.out.println(crescente);

        Arrays.sort(notas, Comparator.reverseOrder()); // descrescente

        String descrescente = Arrays.toString(notas);

        System.out.println(descrescente);

    }
}
