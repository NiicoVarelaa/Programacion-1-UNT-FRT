import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {
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

/* Para hacer un estudio de mercado sobre los detergentes Ala, Granby y Drive, una empresa encuestó a 
105 dueñas de casa, las que debían responder sobre el uso de cada producto con: 1 (en caso de usarlo), 
0 (en caso de no usarlo). Así, una dueña de casa podría usar todos los detergentes o por el contrario sólo 
dos o ninguno. Desarrolle un programa que permita:
a. Indicar el o los detergentes que tienen mayor y menor uso
b. Indicar el número de personas que usan al menos dos detergentes. */