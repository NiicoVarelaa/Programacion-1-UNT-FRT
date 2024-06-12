import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int vector [] = new int[50];

        for (int i = 65; i < 91; i++) {
            for (int j = 65; j < 91; j++) {
                vector[i] = rd.nextInt(100) + 1;
            }
        }
        sc.close();
    }

}

/* Cargar un conjunto de nombres de personas (cadenas de caracteres de longitud máxima 30) en un vector. 
Mostrar un listado ordenado alfabéticamente */