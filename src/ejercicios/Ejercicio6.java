package ejercicios;

/*
 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos la variable suma para almacenar números impares.
        int suma = 0;

        // Creamos el bucle for. En donde empezamos en 1 y sumamos de dos en dos para
        // obtener impares, mientras la i sea menor a 20 ya que al ser impares para
        // obtener los diez primeros número necesitamos 20 posiciones.
        for (int i = 1; i <= 20; i += 2) {
            // Iremos almacenando en la variable suma los i en cada bucle.
            suma += i;
        }
        // Mostramos la suma de todos los números
        System.out.println("La suma de todos los número es: " + suma);

    }
}
