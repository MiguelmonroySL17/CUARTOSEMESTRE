package Flujos_Arreglos;

// Demostración de las operaciones con IntStream

import java.util.stream.IntStream;

public class OperacionesIntStream {
    public static void main(String[] args) {
        int[] valores = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        //int[] valores = {10,8,6,1,4,8,2,5,9,7,6,4,3,5,3};
        // muestra los valores originales
        System.out.print("Valores originales: ");
        IntStream.of(valores).forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        // cuenta, min, max, suma y promedio de los valores
        System.out.printf("Cuenta: %d", IntStream.of(valores).count());
        imprimirLinea();
        System.out.printf("Mínimo: %d", IntStream.of(valores).min().getAsInt());
        imprimirLinea();
        System.out.printf("Máximo: %d", IntStream.of(valores).max().getAsInt());
        imprimirLinea();
        System.out.printf("Suma: %d", IntStream.of(valores).sum());
        imprimirLinea();
        System.out.printf("Promedio: %.2f", IntStream.of(valores).average().getAsDouble());
        imprimirLinea();

        // Suma de todos los valores con eI método reduce
        // 3, 10, 6, 1, 4, 8, 2, 5, 9, 7
        System.out.printf("Suma mediante reduce: %d", IntStream.of(valores).reduce(1, (x, y) -> x + y));
        imprimirLinea();

        // Suma de los cuadrados de los valores con el método reduce
        // 9, 100, 36, 1, 16, 64, 4, 25, 81, 49
        System.out.printf("Suma de los cuadrados mediante reduce: %d", IntStream.of(valores).reduce(0, (x, y) -> x + y * y));
        imprimirLinea();

        // Producto de los valores con el metodo reduce
        // 3 * 10 * 6 * 1 * 4 * 8 * 2 * 5 * 9 * 7
        System.out.printf("Producto de los valores mediante reduce: %d", IntStream.of(valores).reduce(1, (x, y) -> x * y));
        imprimirLinea();

        // Valores pares mostrados en orden
        // 3, 10, 6, 1, 4, 8, 2, 5, 9, 7        10 6 4 8 2
        System.out.println("Valores pares mostrados en orden");
        IntStream.of(valores)
                .filter(valor -> valor % 2 == 0)
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        // Valores impares multiplicados por 10 y mostrados en orden
        // 3, 10, 6, 1, 4, 8, 2, 5, 9, 7        30, 10, 50, 90, 70
        System.out.println("Valores impares multiplicados por 10 y mostrados en orden:");
        IntStream.of(valores)
                .filter(valor -> valor % 2 !=0)
                .map(valor -> valor * 10)
                .sorted()
                .forEach(valor -> System.out.printf("%d ", valor));
        imprimirLinea();

        // suma eI rango de enteros del 1 a1 10, exclusivo
        System.out.printf("Suma de enteros del 1 al 9: %d",
                IntStream.range(1, 10).sum());
        imprimirLinea();

        // suma el rango de enteros del 1 a1 10, inclusivo
        System.out.printf("Suma de enteros del 1 a1 10: %d",
                IntStream.rangeClosed(1, 10).sum());
        imprimirLinea();
    }

    public static void imprimirLinea() {
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
}

