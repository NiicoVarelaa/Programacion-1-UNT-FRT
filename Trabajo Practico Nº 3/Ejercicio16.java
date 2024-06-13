import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
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

/* . Dado un arreglo de orden 30 que almacene los números enteros, desarrolle un programa que llene el 
arreglo. Además, debe permitir ordenar los elementos que están en las posiciones pares en forma 
ascendente y los elementos que están en las posiciones impares en forma descendente
Observaciones:
a) No utilice otro arreglo para dejar ordenado los elementos 
b) No ordene los valores al momento de ingresarlo */