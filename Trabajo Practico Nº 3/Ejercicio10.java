import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la Dimension del Vector");
        int dimensionVector = sc.nextInt();

        int vector [] = new int[dimensionVector];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(1000) + 1;
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

        System.out.println("\n");
        System.out.println("Ingrese el Elemento que desea encontrar en el vector");
        int elementoEncontrar = sc.nextInt();

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

        int inicio = 0;
        int fin = vector.length-1;
        int medio;

        while (inicio <= fin) {
            medio = (inicio+fin)/2;    
            if (vector[medio] == elementoEncontrar) {
                return medio;
            } else {
                if (vector[medio] < elementoEncontrar) {
                    inicio = medio + 1;
                } else {
                    fin = medio - 1;
                }
            }
        }

        return -1;
    }

}

/* Ídem problema anterior, pero el vector está ordenado ascendente. Búsqueda binaria. */