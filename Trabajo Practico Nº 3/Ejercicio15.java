import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Dado 10 Numeros Enteros");
        System.out.println("\n");
        int vector10 [] = new int[10];

        int aux = 0;

        int sumaNumeros = 0;
        double promedioNumeros = 0;

        int numMaximo = vector10[0];
        int posiciónMaximo = 0;
        int contadorNumerosMenoresPromedio = 0;

        int numMinimo = vector10[0];
        int posiciónMenor = 0;
        int contadorNumerosMayoresPromedio = 0;

        for (int i = 0; i < 10; i++) {
            vector10[i] = rd.nextInt(100) + 1;
        }

        for (int i = 0; i < vector10.length; i++) {
            System.out.println("Los Numero son: " + vector10[i]);
            if (i == 0) {
                numMinimo = vector10[i];
                numMaximo = vector10[i];
            } else {
                if (vector10[i] < numMinimo) {
                    numMinimo = vector10[i];
                    posiciónMenor = i;
                }
                if (vector10[i] > numMaximo) {
                    numMaximo = vector10[i];
                    posiciónMaximo = i;
                }
            }
        }

        System.out.println("\n");
        System.out.println("El número menor es: " + numMinimo + " y se Encuentra en la Posición " + posiciónMenor);
        System.out.println("\n");
        System.out.println("El número mayor es: " + numMaximo + " y se Encuentra en la Posición " + posiciónMaximo);


        for (int i = 0; i < vector10.length; i++) {
            sumaNumeros = sumaNumeros + vector10[i];
        }
        
        promedioNumeros = sumaNumeros / 10;
        System.out.println("\n");
        System.out.println("El Promedio de los Numero son: " + promedioNumeros);


        for (int i = 0; i < vector10.length; i++) {
            if (vector10[i] < promedioNumeros) {
                contadorNumerosMenoresPromedio++;
            }
            if (vector10[i] > promedioNumeros) {
                contadorNumerosMayoresPromedio++;
            }
        }

        System.out.println("\n");
        System.out.println("La Cantidad de Numeros Bajo el Promedio son: " + contadorNumerosMenoresPromedio);
        System.out.println("\n");
        System.out.println("La Cantidad de Numeros Sobre el Promedio son: " + contadorNumerosMayoresPromedio);


        for (int i = 0; i < vector10.length-1; i++) {
            for (int j = 0; j < vector10.length-1; j++) {
                if (vector10[j] > vector10[j + 1]) {
                    aux = vector10[j];
                    vector10 [j] = vector10[j + 1];
                    vector10[j + 1] = aux;
                }
            }
        }

        System.out.println("\n");
        System.out.println("Vector ordenado Ascendentemente:");
        System.out.println("\n");
        for (int i = 0; i < vector10.length; i++) {
            System.out.print(vector10[i] + " ");
        }

        sc.close();
    }

}

/* . Desarrolle un programa que dado 10 números enteros:
a) Lea el arreglo de orden 10.
b) Calcule el promedio de 10 números
c) Calcule el número mayor indicando su posición dentro del arreglo 
d) Calcule el número menor indicando su posición dentro del arreglo
e) Calcule la cantidad de números bajo/sobre el promedio
f) Odene en forma ascendente el arreglo */