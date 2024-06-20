import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        mostrarVector();
    }

    public static void mostrarVector() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Cantidad de Números Flotantes que desea Guardar en el Vector");
        int numIngresado = sc.nextInt();

        float vector [] = new float[numIngresado];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextFloat(10) + 1;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el Indice " + i );
            System.out.printf("Tengo Guardado un: %.1f%n", vector[i]);
            System.out.println("----------------------------------");
        }

        sc.close();
    }

}

/* Dado n entero positivo y un listado de n números coma flotante, almacenar los números en un vector. 
Muestre el contenido del vector indicando la posición ocupada por cada número a partir de la primera 
posición. */
