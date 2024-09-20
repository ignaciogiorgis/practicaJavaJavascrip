package practica4;

import java.util.Arrays;

public class Practica4 {

    public static long sumTwoSmallestNumbers(final long[] numbers) {
        //Crea una función que devuelva la suma de los dos números positivos más bajos dada una matriz de un mínimo de 4 números enteros positivos.
        // No se pasarán números flotantes ni números enteros no positivos.
        long[] menores = Arrays.stream(numbers)
                .sorted()
                .limit(2)
                .toArray();
        return menores[0] + menores[1];
    }






    public static void main(String[] args) {
        long[] numeros = {4, 2, 7, 1, 9, 3};
        var min = sumTwoSmallestNumbers(numeros);
        System.out.println("El número más pequeño es: " + min);
    }
}
