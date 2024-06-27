import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las Filas de la Matriz");
        int filas = sc.nextInt();

        System.out.println("Ingrese las Columnas de la Matriz");
        int columnas = sc.nextInt();

        System.out.println("");

        int matrizA [] [] = new int[filas] [columnas];
        int matrizB [] [] = new int[filas] [columnas];
        int matrizC [] [] = new int[filas] [columnas];

        System.out.println("Matriz A");

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizA [i] [j] = rd.nextInt(20) + 1;
                System.out.print(matrizA[i] [j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Matriz B");

        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                matrizB [i] [j] = rd.nextInt(20) + 1;
                System.out.print(matrizB[i] [j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Matriz C = k * A");

        int k = 3;

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                matrizC [i] [j] = matrizA [i] [j] * k;
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                System.out.print(matrizC[i] [j] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n");
        System.out.println("Matriz C = A + B");
        sumaMatrizAyB(matrizA, matrizB, matrizC);
        
        

        sc.close();
    }

    private static int[][] sumaMatrizAyB(int matrizA [][], int matrizB [][], int matrizC [][]) {
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC.length; j++) {
                matrizC [i] [j] = matrizA [i] [j] + matrizB [i] [j];
            }
        }

        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[0].length; j++) {
                System.out.print(matrizC[i] [j] + " ");
            }
            System.out.println("");
        }
        return matrizC;
    }

    

}

/* Desarrolle un programa considerando dos matrices A y B:
a. Ingrese los valores de las matrices
b. Calcule la matriz C=k* A, donde K >0
c. Calcule la matriz C=A+B */