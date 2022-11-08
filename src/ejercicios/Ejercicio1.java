package ejercicios;

import java.util.Scanner;

/*
 * Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // Creamos una variable num que le pediremos al usuario.
        int num;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Creamos el bucle for. Iniciamos la i como 1, mientras i sea menor igual que
        // num seguirá sumando uno a la variable i.
        for (int i = 1; i <= num; i++) {

        // Imprimimos siempre la variable i.
            System.out.println(i);
        }

        //Cerramos el escaner
        key.close();
    }
}
