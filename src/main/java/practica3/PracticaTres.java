package practica3;


//Su tarea es crear dos funciones ( maxy min, o maximumy minimum, etc., dependiendo del
// lenguaje) que reciban una lista de números enteros como entrada y devuelvan el
// número más grande y el más bajo de esa lista, respectivamente.

import java.util.List;

public class PracticaTres {


    public int min(int[] list) {
        var min = 0;
        if (list.length == 1) {
            min = list[0];
        }
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] < list[i + 1]) {
                min = list[i];
            } else {
                min = list[i + 1];
            }
        }
        return min;
    }

    public static int max(int[] list) {
        var max = 0;
        if (list.length == 1) {
            max = list[0];
        }
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]) {
                max = list[i];
            } else {
                max = list[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, -50};
        //var resultado = max(arr);
        // System.out.println("resultado = " + resultado);

        var resultado = countPositivesSumNegatives(arr);
        for(int res : resultado){
            System.out.println("res = " + res);
        }
    }

    // Dada una matriz de números enteros.
    //Devuelve una matriz, donde el primer elemento es el recuento de números positivos y
    // el segundo elemento es la suma de números negativos. 0 no es ni positivo ni negativo.


    public static int[] countPositivesSumNegatives(int[] input) {
        int sumNeg = 0;
        int sumPos = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                sumPos += input[i];
            }else{
                sumNeg += input[i];
            }
        }
        int[] nuevoArr = new int[]{sumPos, sumNeg};

        return nuevoArr; //return an array with count of positives and sum of negatives
    }

}


