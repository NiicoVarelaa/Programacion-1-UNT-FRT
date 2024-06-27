import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        mostrarVector();
    }

    private static void mostrarVector() {
        Random rd = new Random();

        int vector [] = new int [20];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(30) + 1;
        }

        System.out.println();
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        int aux;

        for (int i = 0; i < vector.length-1; i++) {
            for (int j = 0; j < vector.length-1; j++) {
                if (vector[j] < vector[j + 1]) {
                    aux = vector[j];
                    vector [j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Vector Ordenado Decrecientemente");
        System.out.println();
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

}

/* Leer 20 números enteros positivos. Mostrar el vector tal como fue ingresado y luego mostrar el vector 
ordenado en forma decreciente. */