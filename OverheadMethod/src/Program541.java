public class Program541 {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 5;

        double d = 2.5;
        double e = 3.5;
        double f = 4.5;

        System.out.printf("Highest number is: %d", UtilNumber.highestNumber(a,b));
        System.out.println();
        System.out.printf("Highest number is: %d", UtilNumber.highestNumber(a,b,c));
        System.out.println();
        System.out.printf("Highest number is: %.2f", UtilNumber.highestNumber(d,e));
        System.out.println();
        System.out.printf("Highest number is: %.2f", UtilNumber.highestNumber(d,e,f));


        Integer n1 = 128;
        Integer n2 = 128;
        Short n3 = 128;

        System.out.println();
        System.out.println(n1.equals(n2));

        System.out.println();
        System.out.println(n2.equals(n3)); // por ser objeto compara o tipo do objeto assim como o valor referenciado, por isso desta forma retorna false
        System.out.println(n2.intValue() == n3.intValue()); // aqui transforma os valores em int e compara somente os valores.



    }
}
