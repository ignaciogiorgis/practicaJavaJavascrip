package practica1;

/*
1)Tu tarea es encontrar el número cuadrado más cercano de un entero positivo n. En matemáticas, un número cuadrado o cuadrado perfecto es un entero que es el cuadrado de un entero; en otras palabras, es el producto de un entero consigo mismo.

        Por ejemplo, si n = 111, entonces el número cuadrado más cercano es igual a 121, ya que 111 está más cerca de 121, el cuadrado de 11, que de 100, el cuadrado de 10.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practica {
    public static void main(String[] args) {
        var es = nearestSq(111);

        var es2 = toBinary(456);
        System.out.println("es2 = " + es2);
    }

    //ejer1
    public static int nearestSq(final int n) {
        var raizConDecimal = Math.sqrt(n);
        var raiz = Math.sqrt(n) - Math.floor(raizConDecimal);
        var result = 0;
        if (raiz == 0) {
            return n;
        }
        if (raiz > 0.5) {
            result = (int) Math.floor(raizConDecimal) + 1;
        } else {
            result = (int) Math.ceil(raizConDecimal) - 1;
        }
        return result * result;
    }

    //Dado un entero no negativo n, escriba una función que devuelva ese número en formato binario como un entero.

    public static int toBinary(int n) {
        List<Integer> binario = new ArrayList<>();

        while (n > 0) {
            binario.add(n % 2);
            n = n / 2;
        }

        Collections.reverse(binario);

        StringBuilder sb = new StringBuilder();
        for (int bit : binario) {
            sb.append(bit);
        }

        return Integer.parseInt(sb.toString());
    }


}
