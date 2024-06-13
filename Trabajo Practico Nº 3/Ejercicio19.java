import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Nombre");
        int vector [] = new int[50];

        for (int i = 65; i < 91; i++) {
            for (int j = 65; j < 91; j++) {
                vector[i] = rd.nextInt(100) + 1;
            }
        }
        sc.close();
    }

}

/* Considerando una matriz de orden MxN, elabore un programa que: 
a. Ingrese los valores de la matriz
b. Determine el mayor elemento y su posición
c. Determine el menor elemento y su posición
d. Sume todos los elementos de la matriz. */
