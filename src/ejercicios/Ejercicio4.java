package ejercicios;

import java.util.Scanner;

/*
 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;
        int contador = 0;

        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Creamos el bucle for. Iniciamos la i como 3, mientras sea la i menor que la
        // variable num iremos sumando de 3 en 3 para obtener los múltiplos de 3.
        for (int i = 3; i <= num; i += 3) {
            // Imprimimos siempre la variable i.
            contador++;
        }

        // Imprimimos el número de veces
        System.out.println("Hay un total de " + contador + " mútiplos de 3 en " + num);
        // Cerramos el escaner
        key.close();
    }
}
