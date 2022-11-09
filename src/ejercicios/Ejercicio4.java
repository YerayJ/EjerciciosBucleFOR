package ejercicios;

import java.util.Scanner;

/*
 * Escribir todos los múltiplos de 7 menores que 100.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;

        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Creamos el bucle for. Iniciamos la i como 3, mientras sea la i menor que la
        // variable num iremos sumando de 3 en 3 para obtener los múltiplos de 3.
        for (int i = 3; i <= num; i += 3) {
            // Imprimimos siempre la variable i.
            System.out.println(i);
        }

        // Cerramos el escaner
        key.close();
    }
}
