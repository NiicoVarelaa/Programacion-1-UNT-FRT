import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
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

/* Leer 20 números enteros positivos. Mostrar el vector tal como fue ingresado y luego mostrar el vector 
ordenado en forma decreciente. */