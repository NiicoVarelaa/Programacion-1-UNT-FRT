import java.util.Random;
import java.util.Scanner;

public class Ejercicio18 {
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

/* De los 100 empleados de una fábrica se registra: número de legajo (coincide con el número de indice), 
edad y salario. Se pide:
 Ingresar los datos correlativamente
 Calcular la edad promedio informando número de legajo de los empleados cuya edad supere el 
promedio. */