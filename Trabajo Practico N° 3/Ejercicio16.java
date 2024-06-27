import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        mostrarVector();
    }

    private static void mostrarVector() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int vector [] = new int [30];

        for (int i = 0; i < vector.length; i++) {
            vector [i] = rd.nextInt(30) + 1;
        }

        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        int aux;

        for (int i = 0; i < vector.length; i += 2) {
            for (int j = 0; j < vector.length - 2; j += 2) {
                if (vector[j] > vector[j + 2]) {
                    aux = vector[j];
                    vector[j] = vector[j + 2];
                    vector[j + 2] = aux;
                }
            }
        }

        for (int i = 1; i < vector.length; i += 2) {
            for (int j = 1; j < vector.length - 2; j += 2) {
                if (vector[j] < vector[j + 2]) {
                    aux = vector[j];
                    vector[j] = vector[j + 2];
                    vector[j + 2] = aux;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Vector Ordenado");
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        sc.close();
    }

}


                    
/* . Dado un arreglo de orden 30 que almacene los números enteros, desarrolle un programa que llene el 
arreglo. Además, debe permitir ordenar los elementos que están en las posiciones pares en forma 
ascendente y los elementos que están en las posiciones impares en forma descendente
Observaciones:
a) No utilice otro arreglo para dejar ordenado los elementos 
b) No ordene los valores al momento de ingresarlo */