import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        vectorOrdenado();
    }

    public static void vectorOrdenado() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la Dimension del Vector");
        int dimension = sc.nextInt();

        int vector [] = new int[dimension];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(100) + 1;
        }

        int aux;

        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector [j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("");
        System.out.println("Vector ordenado de menor a mayor:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        sc.close();
    }

}

// Dado un vector de orden N de valores enteros, ordénelos de menor a mayor.
