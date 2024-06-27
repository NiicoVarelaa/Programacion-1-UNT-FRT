import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        mostrarArregloTridimencional();
    }

    private static void mostrarArregloTridimencional() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Arreglo Tridimensional");
        
        System.out.println("");
        System.out.println("Ingrese las Filas del Arreglo");
        int filas = sc.nextInt();

        System.out.println("");
        System.out.println("Ingrese las Columnas del Arreglo");
        int columnas = sc.nextInt();

        System.out.println("");
        System.out.println("Ingrese la Profundidad del Arreglo");
        int profundidad = sc.nextInt();

        System.out.println("");
        
        int tridimensional [] [] [] = new int [filas] [columnas] [profundidad];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < profundidad; k++) {
                    tridimensional[i][j][k] = rd.nextInt(50) + 1;
                }
            }
        }

        System.out.println("Matriz Tridimensional:");
        System.out.println("");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < profundidad; k++) {
                    System.out.print(tridimensional[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }

}

/* Realice un programa que genere un arreglo tridimensional de orden MxNxY con números al azar. Muestre 
los elementos del arreglo. */
