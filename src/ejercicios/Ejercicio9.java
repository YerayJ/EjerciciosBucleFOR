package ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */

public class Ejercicio9 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;
        boolean esPrimo = true;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario en positivo.
        System.out.println("Deme un número positivo: ");
        num = key.nextInt();

        // Aquí hacemos una comprobación de que el número que entra es positivo.
        if (num > 0) {
            // Creamos el bucle for en el que la i empieza en 2 porque ya sabemos que el uno
            // es un número primo. Esto se ejecutará mientras la i sea menor que num
            for (int i = 2; i < num; i++) {
                // Si num al dividirlo entre dos da resto 0 devolveremos la variable esPrimo
                // como false y saldremos del bucle.
                if (num % 2 == 0) {
                    esPrimo = false;
                    break;
                }
            }
            // Crearemos un ternario en el que imprimimos es primo si el número es distinto
            // de uno y es true, sin falso.
            System.out.println((esPrimo && num != 1) ? "El número es primo" : "El número no es primo");
        } else {
            // Si el número no es positivo entra en el en este sysout.
            System.out.println("El número no es positivo");
        }
        // Cerramos el escaner
        key.close();
    }
}
