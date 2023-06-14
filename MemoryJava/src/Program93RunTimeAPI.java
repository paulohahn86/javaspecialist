public class Program93RunTimeAPI {

    public static void main(String[] args) {

        printUseMemory();

        byte[] x = new byte[500 * 1024 * 1024];

        printUseMemory();

    }

    private static void printUseMemory() {

        System.out.printf("Maximum: %s%n", inMegabytes(Runtime.getRuntime().maxMemory())); // máximo de memória HEAP disponível pelo SO.

        System.out.printf("Total committed: %s%n", inMegabytes(Runtime.getRuntime().totalMemory())); // memória reservada na memória HEAP.

        System.out.printf("Available: %s%n", inMegabytes(Runtime.getRuntime().freeMemory())); // memória HEAP em uso pela JVM.

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.printf("Used HEAP memory: %s%n", inMegabytes(memoriaUsada)); // memória HEAP em uso pela JVM.

        System.gc(); // Garbage Collector - clears HEAP memory with unreachable object



        // OUTOFMEMORYERROR  - exception criada quando o Java Heap "estoura" o espaço alocado.


    }

    private static Object inMegabytes(long maxMemory) {

        return String.format("%.2fMB", maxMemory / 1024d / 1024d);

    }

}
