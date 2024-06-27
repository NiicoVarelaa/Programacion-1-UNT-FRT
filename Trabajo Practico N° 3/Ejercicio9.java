import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el Elemento que desea encontrar en el vector");
        int elementoEncontrar = sc.nextInt();
        
        int dimensionVector = rd.nextInt(50) + 1;

        int vector [] = new int[dimensionVector];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rd.nextInt(100) + 1;
        }

        int elementoEncontrado = elementoParaEncontrar(vector, elementoEncontrar);

        if (elementoEncontrado != -1) {
            System.out.println("El Elemento se Encuentra en el Vector en la posición: " + elementoEncontrado);
        } else {
            System.out.println("Elemento No Encontrado");
        }

        sc.close();
    }

    public static int elementoParaEncontrar(int vector [], int elementoEncontrar) {

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elementoEncontrar) {
                return i;
            }
        }       

        return -1;
    }

}

/* Dado un vector A de orden N y un elemento P del mismo tipo que los elementos del vector, buscar P en 
el vector A y devolver la posición que ocupa en caso de encontrarlo o una señal en caso contrario. No 
hay repeticiones. */