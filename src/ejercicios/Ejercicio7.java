package ejercicios;

import java.util.Scanner;

/*
 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y es igual a 5x4x3x2x1 = 120.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        // Creamos la variable suma para almacenar números impares.
        int factorial = 1;
        int num;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme un número: ");
        num = key.nextInt();

        // Creamos el bucle for.
        for (int i = 1; i <= num; i++) {
            // 
            System.out.println(i);
            factorial*=i;
        }
        // Mostramos la suma de todos los números
        System.out.println("La suma de todos los número es: " + factorial);

        // Cerramos el escaner
        key.close();

    }
}
