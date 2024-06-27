import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        int resultadoProductos = productoEscalar();
        System.out.println("\n");
        System.out.println("El Resultado Total del Producto a Escalar de los vectores es: " + resultadoProductos);

    }

    public static int productoEscalar() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Cantidad de Números que tendra el Vector");
        int numIngresado = sc.nextInt();

        int vectorA [] = new int[numIngresado];

        for (int i = 0; i < vectorA.length; i++) {
            vectorA [i] = rd.nextInt(100) + 1;
        }

        int vectorB [] = new int[numIngresado];

        for (int i = 0; i < vectorB.length; i++) {
            vectorB [i] = rd.nextInt(100) + 1;
        }

        int productoVectores = 0;

        for (int i = 0; i < numIngresado; i++) {
            System.out.println("Estoy en el Indice " + i );
            System.out.println("En el Vector A tengo un: " + vectorA[i] + " y En el Vector B tengo un: " + vectorB[i]);
            productoVectores += vectorA[i] * vectorB[i];
            System.out.println("El Resultado de la multiplicacion de los dos vectores: " + productoVectores);
            System.out.println("----------------------------------");
        }

        sc.close();

        return productoVectores;
    }

}

/* Escribir un programa que dados dos vectores A y B de orden N, devuelva el producto escalar P, es 
decir, P = ∑(A[i] * B[i]) para 0 <= i <= n-1. */
