package ejercicios;

/*
 * Escribir todos los múltiplos de 7 menores que 100.
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        // Creamos el bucle for. Iniciamos la i como 7, mientras sea la i menor 100
        // iremos sumando de 7 en 7 para obtener los múltiplos de 7.
        for (int i = 7; i <= 100; i += 7) {
            // Imprimimos siempre la variable i.
            System.out.println(i);
        }
    }
}
