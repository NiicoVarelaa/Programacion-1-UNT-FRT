import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
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

/* La semana pasada llovió en la ciudad y se registraron los datos de los milímetros de agua caída en cada 
hora en cada día de la semana. Desarrolle un programa para:
a. Leer la matriz con los datos de agua caída
b. Determinar el día con mayor agua caída
c. Determinar el día y la hora con menor agua caída. */