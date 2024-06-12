import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Elemento que desea encontrar en el vector");
        int elementoEncontrar = sc.nextInt();

        int vector [] = new int[50];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(100) + 1;
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

        System.out.println("Vector Ascendente:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        int elementoEncontrado = busquedaBinaria(vector, elementoEncontrar);

        if (elementoEncontrado != -1) {
            System.out.println("\n");
            System.out.println("Elemento Encontrado en el Vector en la posición: " + elementoEncontrado);
        } else {
            System.out.println("\n");
            System.out.println("Elemento No Encontrado");
        }
        sc.close();
    }

    public static int busquedaBinaria(int vector [], int elementoEncontrar) {

        for (int i = 0; i < 25; i++) {
            if (vector[i] == elementoEncontrar) {
                return i;
            }
        }
        
        for (int i = 49; i > 25; i--) {
            if (vector[i] == elementoEncontrar) {
                return i;
            }
        } 

        return -1;
    }

}

/* Ídem problema anterior, pero el vector está ordenado ascendente. Búsqueda binaria. */