package ejercicios;

import java.util.Scanner;

/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        // Creamos la variable nota para pedírsela al usuario y suspensos lo usaremos
        // como contador.
        int suspensos = 0;
        double nota;

        // Creamos escaner para leer datos
        Scanner key = new Scanner(System.in);

        // Pedimos la variable al usuario
        System.out.println("Deme 5 calificaciones de alumnos: ");

        // Creamos el bucle for en el que empezamos en 0 y como solo necesitamos 5 notas
        // añadiremos el 5 como límite.
        for (int i = 0; i < 5; i++) {
            // Metemos en el bucle el nextInt para ir pidiendo en cada vuelta variable nota
            // al usuario.
            nota = key.nextDouble();
            // Si la nota es menor a 5 añadiré a la variable suspensos uno.
            if (nota < 5) {
                suspensos++;
            }
        }
        // Mostramos la cantidad de suspenso que hay
        System.out.println("El número de suspensos es: " + suspensos);

        //Cerramos el escaner
        key.close();
    }
}
