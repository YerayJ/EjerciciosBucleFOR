package ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que pida dos números enteros A y B, siendo B mayor que A. Luego visualiza los números desde A hasta B.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        // Creamos la variable a y b para pedírsela al usuario.
        int a, b;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable a y b al usuario.
        System.out.println("Deme los valores de a y b: ");
        a = key.nextInt();
        b = key.nextInt();

        // Creamos el bucle for en el que sustituimos la a por la i, mientras esta sea
        // menor que b se seguirá añadiendo uno a la variable i.
        for (int i = a; i < b; i++) {
            // En cada pasada del bucle vamos imprimiendo la variable i
            System.out.println(i);
        }
        // Imprimimos b al final
        System.out.println(b);
        // Cerramos el escaner
        key.close();
    }
}
