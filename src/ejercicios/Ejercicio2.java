package ejercicios;

/*
 * Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello suma de 2 en 2.
 */

public class Ejercicio2  {
    public static void main(String[] args) {

        // Creamos el bucle for. Iniciamos la i como 2, mientras i sea menor igual que
        // 200 seguirá sumando dos a la variable i.
        for (int i = 2; i <= 200; i+=2) {
        // Imprimimos siempre la variable i.
        System.out.println(i);
        }
    }
}
