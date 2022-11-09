package ejercicios;

import java.util.Scanner;

/*
 * Pedir diez números por teclado y mostrar la media.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        // Creamos la variable num para pedírsela al usuario.
        int num;
        double media = 0;
        // Creamos un escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme diez números: ");
        num = key.nextInt();

        // Creamos el bucle for. Iniciamos la i en 1 y mientras sea menor de 10 se
        // seguirá ejecutando, ya que hemos un número fuera, y a la i que sería como el
        // contador le vamos añadiendo 1.
        for (int i = 1; i < 10; i++) {
            // Pedimos en el bucle variables al usuario.
            num = key.nextInt();
            // Iremos almacenando en la variable media los num en cada bucle.
            media += num;
        }

        // Mostramos la media diviendo la variable entre 10.
        System.out.println("La media de todos los número es: " + (double) media / 10);

        // Cerramos el escaner
        key.close();
    }
}
