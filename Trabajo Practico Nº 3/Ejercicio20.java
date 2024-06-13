import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {
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

/* Desarrolle un programa considerando dos matrices A y B:
a. Ingrese los valores de las matrices
b. Calcule la matriz C=k* A, donde K >0
c. Calcule la matriz C=A+B */