import java.util.Random;
import java.util.Scanner;

public class Ejercicio12 {
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

/* Dados 2 vectores A y B de orden N y M, el primero ordenado ascendente y el segundo ordenado 
descendente, crear un nuevo vector C de orden N+M elementos intercalando los elementos de A Y 
B de modo que C quede ordenado ascendente. Es decir que hay que primero ordenar B de modo 
ascendente para luego intercalar los valores de A y B de modo que C quede ordenado 
ascendentemente sin utilizar ningún método de ordenamiento. */