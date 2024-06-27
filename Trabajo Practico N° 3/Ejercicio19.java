import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las Filas de la Matriz");
        int filas = sc.nextInt();

        System.out.println("");
        System.out.println("Ingrese las Columnas de la Matriz");
        int columnas = sc.nextInt();
        System.out.println("");

        int matriz [] [] = new int[filas] [columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz [i] [j] = rd.nextInt(100) + 1;
                System.out.print(matriz[i] [j] + " ");
            }
            System.out.println("");
        }

        int numMaximo = matriz [0] [0];
        int numMinimo = matriz [0] [0];

        int posiciónFilaMenor = 0;
        int posiciónColumnaMenor = 0;

        int posiciónFilaMayor = 0;
        int posiciónColumnaMayor = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [i] [j] < numMinimo) {
                    numMinimo = matriz [i] [j];
                    posiciónFilaMenor = i;
                    posiciónColumnaMenor = j;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz [i] [j] > numMaximo) {
                    numMaximo = matriz [i] [j];
                    posiciónFilaMayor = i;
                    posiciónColumnaMayor = j;
                }
            }
        }

        System.out.println("\n");
        System.out.println("El Número Menor es: " + numMinimo + " y se Encuentra en la Fila " + posiciónFilaMenor + " Columna " + posiciónColumnaMenor);

        System.out.println("\n");
        System.out.println("El Número Mayor es: " + numMaximo + " y se Encuentra en la Fila " + posiciónFilaMayor + " Columna " + posiciónColumnaMayor);
        
        System.out.println("\n");

        System.out.println("La Suma de los Elementos de la Matriz es: " + sumaElementos(matriz));

        sc.close();
    }

    private static int sumaElementos(int matriz [] []) {
        int sumaMatriz = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        
        return sumaMatriz;
    }

}

/* Considerando una matriz de orden MxN, elabore un programa que: 
a. Ingrese los valores de la matriz
b. Determine el mayor elemento y su posición
c. Determine el menor elemento y su posición
d. Sume todos los elementos de la matriz. */
